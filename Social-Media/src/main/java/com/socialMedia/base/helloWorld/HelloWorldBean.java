package com.socialMedia.base.helloWorld;

public class HelloWorldBean {

	private String msg;

	public HelloWorldBean(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [msg=%s]", msg);
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
