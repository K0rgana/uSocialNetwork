package br.edu.ifpe.igarassu.ipi.poo.usn.data.entity.user;

import br.edu.ifpe.igarassu.ipi.poo.usn.data.entity.Entity;
/**
 * 
 * Represents an Post on the social network 
 * 
 *
 */
public class Post extends Entity {
	        
        // the content of the user
        private String content;
        private User username;
	
	public Post(long id, User username,String content) {
		super(id);
		this.username = username;
                this.content = content;
                
	}

}
