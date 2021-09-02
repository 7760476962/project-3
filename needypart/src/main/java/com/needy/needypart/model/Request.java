package com.needy.needypart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="request")
public class Request {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int requestid;
	private String request;

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Request(String request) {
		super();
		this.request = request;
	}

	@Override
	public String toString() {
		return "Request [requestid=" + requestid + ", request=" + request + "]";
	}
	
	

}
