package com.ecwm.rest.webservices.ecwmwebapp.bean;

public class StarterBean {

	private String message;

	public StarterBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toString() {
		return String.format("StarterBean [message=%s]", message);
	}

}
