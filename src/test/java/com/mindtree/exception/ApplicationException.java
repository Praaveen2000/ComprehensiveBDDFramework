package com.mindtree.exception;

public class ApplicationException extends Exception {
	String msg;

	public ApplicationException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;

	}

	public String toString() {
		return msg;
	}
}
