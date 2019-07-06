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

package br.edu.ifpe.igarassu.ipi.poo.usn.data.entity.user;

import br.edu.ifpe.igarassu.ipi.poo.usn.data.entity.Entity;

/**
 * 
 * Represents an user on the social network 
 * 
 * @author Allan Diego Silva Lima - allan.lima@igarassu.ifpe.edu.br
 *
 */
public class User extends Entity {
	// the username of the user
	private String username;
        
        // the email of the user
        private String email;
        
	// the passord of the user
	private String password;
        
        // declares an array of followers 
        //private followers[] followerslist;
        
        //declares an array of users the user is following
        //private following[] followinglist;
        
        // declares an array of posts
        //private posts[] postlist;

	/**
	 * 
	 * Initializes the classe's parameters with the given parameters 
	 * 
	 * @param id the id the of user
	 * @param username the username of the user
         * @param email the email of the user
         * @param password the password of the user
         * @param followerslist the array of followers of the user
         * @param postslist the the array of posts of the user
	 */
	public User(long id, String username, String email, String password) {
		super(id);
		this.username = username;
                this.email = email;
                this.password = password;
                //followers[] = this.followerslist;
                //posts[] = this.postlist; 
	}
        
	/**
	 * 
	 * Returns the username of the user
	 * 
	 * @return the username of the user
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 
	 * Sets the username of the user
	 * 
	 * @param username the new username of the user
	 */
	public void setUsername(String username) {
		this.username = username;
	}
        /**
	 * 
	 * Returns the email of the user
	 * 
	 * @return the email of the user
	 */
        public String getEmail() {
            return email;
        }
        /**
	 * 
	 * Sets the email of the user
	 * 
	 * @param email the new email of the user
	 */
        public void setEmail(String email) {
            this.email = email;
        }
        
	/**
	 * 
	 * Returns the password of the user
	 * 
	 * @return the password of the user
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 
	 * Sets the password of the user
	 * 
	 * @param password the new password of the user
	 */
	public void setPassword(String password) {
		this.password = password;
	}
        
//        public followers[] getFollowerslist() {
//            return followerslist;
//        }
//
//        public void setFollowerslist(followers[] followerslist) {
//            this.followerslist = followerslist;
//        }
//
//        public following[] getFollowinglist() {
//            return followinglist;
//        }
//
//        public void setFollowinglist(following[] followinglist) {
//            this.followinglist = followinglist;
//        }
//        
//    
//        public posts[] getPostlist() {
//          return postlist;
//        }
//
//        public void setPostlist(posts[] postlist) {
//          this.postlist = postlist;
//        }

    

      

}
