package com.cleber.booksBuildapi.resource.exptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{

	private List<FieldMessages> listFieldmessages = new ArrayList<>();
	
	public ValidationError() {
		super();
		
	}

	public ValidationError(Long timesTemp, int status, String error) {
		super(timesTemp, status, error);
		
	}

	public List<FieldMessages> getMessages() {
		return listFieldmessages;
	}

	public void addMessages(String fieldName, String message) {
		this.listFieldmessages.add(new FieldMessages(fieldName, message)) ;
	}

}
