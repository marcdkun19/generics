package org.sgn.generics.common.form;

import lombok.Getter;
import lombok.Setter;

public class SingleResponseEntity<T> {

	@Getter
	@Setter
	private T payload;
	
	@Getter
	@Setter
	Integer status;
	
	
	@Getter
	@Setter
	String message;
	
	
	public SingleResponseEntity<T> payload(T payload) {
		this.payload = payload;
		
		return this;
	}
	
	public SingleResponseEntity<T> status(Integer status) {
		this.status = status;
		
		return this;
	}
	
	public SingleResponseEntity<T> message(String message) {
		this.message = message;
		
		return this;
	}
}