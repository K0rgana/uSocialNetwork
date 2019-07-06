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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.edu.ifpe.igarassu.ipi.poo.usn.data.access.arraylist.ArrayListDAO;

/**
 * 
 * Data access object for users using a ArrayList as collection
 * 
 * @author Allan Diego Silva Lima - allan.lima@igarassu.ifpe.edu.br
 *
 */
public class UserArrayListDAO extends ArrayListDAO<User> implements UserDAO {
	
	/**
	 * 
	 * Search for users containing the string <code>username</code> on their usernames
	 * 
	 * @param username the username to be searched
	 * 
	 * @return a list of <code>Users</code> the contain the string <code>username</code> on their usernames, if there is no results on the search, the method will return an empty list.
	 */
	@Override
	public List<User> searchByName(String username) {
		List<User> result = new ArrayList<User>(); // the list with users to be returned
		
		// notice who the code utilizes an Iterator in order to navigate through all elements on the collection
		for (Iterator<User> iterator = this.list().iterator(); iterator.hasNext();) {
			User element = iterator.next();
			if (element.getUsername().toLowerCase().contains(username.toLowerCase())) {
				result.add(element);
			}
		}
		
		return result;
	}

}
