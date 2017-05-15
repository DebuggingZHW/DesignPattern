package com.hw.responsibility;

public abstract class Abstracthandler {
	private Handler handler;
	
	public Handler getHandler() {
		return handler;
	}
	
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}