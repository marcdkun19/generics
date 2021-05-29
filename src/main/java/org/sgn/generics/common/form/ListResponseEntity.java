package org.sgn.generics.common.form;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class ListResponseEntity<T> {

	@Getter
	@Setter
	private List<T> payload;
	
	@Getter
	@Setter
	private Integer totalRecord;
	
	@Getter
	@Setter
	private Integer displayedRecord;
	
	@Getter
	@Setter
	private Integer recordPerPage = 10;
	
	@Getter
	@Setter
	private Integer totalPage;
	
	@Getter
	@Setter
	private Integer currentPage;
	
	@Getter
	@Setter
	private Integer status;
	
	@Getter
	@Setter
	private String message;
	
	public ListResponseEntity<T> payload(List<T> payload) {
		this.payload = payload;
		
		return this;
	}
	
	public ListResponseEntity<T> status(Integer status) {
		this.status = status;
		
		return this;
	}
	
	public ListResponseEntity<T> message(String message) {
		this.message = message;
		
		return this;
	}
}