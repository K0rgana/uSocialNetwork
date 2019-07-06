package br.edu.ifpe.igarassu.ipi.poo.usn.data.entity.user;

import java.util.List;

public interface PostDAO {
    /**
	 * 
	 * Returns the Posts stored as a List
	 * 
	 * @return the Posts stored as a List
	 */
	public List<Post> list();

	/**
	 * 
	 * Add an post to the collection
	 * 
	 * @param post the user to be added
	 */
	public void add(Post post);

	/**
	 * 
	 * Removes an post from the collection
	 * 
	 * @param id the id of the post to be removed
	 */
	public void removeById(int id);

	/**
	 * 
	 * Searches for an post on the collection
	 * 
	 * @param id the id of the post to be searched
	 * 
	 * @return the post found or null if the element is not present on the
	 *         collection
	 */
	public Post searchById(long id);

	/**
	 * 
	 * Returns the number of posts stored on the collection
	 * 
	 * @return the number of elements stored on the collection
	 */
	public int size();

	
}
