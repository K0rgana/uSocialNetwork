/*
 *
 * IFPE - Federal Institute of Education, Science and Technology of Pernambuco
 * Informatics for the Internet
 * Object Oriented Programming
 * Professor: Allan Lima - allan.lima@igarassu.ifpe.edu.br
 * 
 * Public domain code, feel free to use, modify and redistribute it 
 *
 */

package br.edu.ifpe.igarassu.ipi.poo.usn.model.controller.server.user;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;

import br.edu.ifpe.igarassu.ipi.poo.usn.data.entity.user.User;
import br.edu.ifpe.igarassu.ipi.poo.usn.model.controller.UserSocialNetworkFacade;
import br.edu.ifpe.igarassu.ipi.poo.usn.model.controller.server.AbstractHandler;

/**
 *
 * Handles a request to add an user.
 * 
 * @author Allan Diego Silva Lima - allan.lima@igarassu.ifpe.edu.br
 *
 */
public class AddUserHandler extends AbstractHandler {

	/**
	 * 
	 * Initializes its attributes
	 * 
	 * @param facade the facade of the system, containing the methods necessary to
	 *               the operation handled by this class
	 */
	public AddUserHandler(UserSocialNetworkFacade facade) {
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
                        String email = parameters.get("email").toString();
			String password = parameters.get("password").toString();
			int id = super.getFacade().numberOfUsers();

			System.out.println("add user " + id + " | " + username + " | " + email + " | " + password);

			User newUser = new User(id, username, email, password);

			// TODO handle errors correctly

			// performs the add
			super.getFacade().addUser(newUser);

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
