package com.cleber.booksBuildapi.resource.exptions;

public class FieldMessages {

	private String fieldName;
	private String message;
	
	public FieldMessages(String fieldName, String message) {
		super();
		this.fieldName = fieldName;
		this.message = message;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
