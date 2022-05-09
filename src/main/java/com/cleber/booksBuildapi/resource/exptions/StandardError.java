package com.cleber.booksBuildapi.resource.exptions;

public class StandardError {

	private Long timesTemp;
	private int status;
	private String error;

	public StandardError() {
		super();
	
	}

	public StandardError(Long timesTemp, int status, String error) {
		super();
		this.timesTemp = timesTemp;
		this.status = status;
		this.error = error;
	}

	public Long getTimesTemp() {
		return timesTemp;
	}

	public void setTimesTemp(Long timesTemp) {
		this.timesTemp = timesTemp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
