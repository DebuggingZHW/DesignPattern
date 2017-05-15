package com.hw.responsibility;

public class Myhandler extends Abstracthandler implements Handler {
	private String name;
	
	@Override
	public void operator() {
		// TODO 自动生成的方法存根
		System.out.println(name + "deal!");
		
		if (getHandler() != null) {
			getHandler().operator();
		}
	}
	
	public Myhandler(String name) {
		this.name = name;
	}

}
