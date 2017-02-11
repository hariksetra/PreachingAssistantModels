package com.giridhari.preachingassistant.rest.model;

/**
 * A generic entity which is part of the response body of a create request.
 * Extend from this class if you want additional info added to the create response.
 * 
 * @author shyam
 *
 */
public class GenericCreateStatusEntity extends GenericStatusEntity {

	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
