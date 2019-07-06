package br.edu.ifpe.igarassu.ipi.poo.usn.model.controller.server.post;

import br.edu.ifpe.igarassu.ipi.poo.usn.data.entity.user.Post;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;

import br.edu.ifpe.igarassu.ipi.poo.usn.model.controller.UserSocialNetworkFacade;
import br.edu.ifpe.igarassu.ipi.poo.usn.model.controller.server.AbstractHandler;

public class AddPostHandler extends AbstractHandler {
	
    /**
	 * 
	 * Initializes its attributes
	 * 
	 * @param facade the facade of the system, containing the methods necessary to
	 *               the operation handled by this class
	 */
	public AddPostHandler(UserSocialNetworkFacade facade) {
		super(facade);
	}

	/**
	 * 
	 * Handles a request to add an user.
	 * 
	 * @param exchange the object containing the metadata of the request
	 * 
	 */
	@Override
	public void handle(HttpExchange exchange) throws IOException {
		try {
			printRequestInfo(exchange);

			// get the post metadata
			Map<String, Object> parameters = parsePostParameters(exchange);

			// gets the data nedded to crate a new user
			String username = parameters.get("username").toString();
                        String content = parameters.get("content").toString();
                        			
			int id = super.getFacade().numberOfUsers();

			System.out.println( username + "add post " + id );

			Post newPost = new Post(id, username, content);

			// TODO handle errors correctly

			// performs the add
			super.getFacade().addPost(newPost);

			// TODO change the response to a JSON Object
			String response = "Sucess";

			exchange.sendResponseHeaders(200, response.length());
			OutputStream os = exchange.getResponseBody();
			os.write(response.getBytes());
			os.close();

		} catch (Exception ex) {
			ex.printStackTrace();

			// TODO change the response to a JSON Object
			String response = "Failure";

			exchange.sendResponseHeaders(401, response.length());

			OutputStream os = exchange.getResponseBody();
			os.write(response.getBytes());
			os.close();
		}

	}

}