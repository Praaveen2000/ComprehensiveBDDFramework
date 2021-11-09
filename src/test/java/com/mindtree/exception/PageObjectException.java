package com.mindtree.exception;

public class PageObjectException extends Exception {
	String msg;

	public PageObjectException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;

	}

	public String toString() {
		return msg;
	}
}
