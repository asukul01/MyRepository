package com.socialMedia.base.exception;

import java.util.Date;


public class ExceptionResponse {
	// timestamp
	// Exception message
	// details

	private Date timeStamp;
	private String msg;
	private String details;

	public Date getTimeStamp() {
		return timeStamp;
	}

	public String getMsg() {
		return msg;
	}

	public String getDetails() {
		return details;
	}

	public ExceptionResponse(Date timeStamp, String msg, String details) {
		super();
		this.timeStamp = timeStamp;
		this.msg = msg;
		this.details = details;
	}
}
