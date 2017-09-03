/**
 * 
 */
package com.raj.model;

import java.io.Serializable;

/**
 * @author Rajendar Kumar
 *
 */
public class Emp implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 8506783466911520195L;
	private String id;
	private String name;
	
	/**
	 * @param id
	 * @param name
	 */
	public Emp(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
