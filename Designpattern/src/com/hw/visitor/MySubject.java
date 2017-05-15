package com.hw.visitor;

public class MySubject implements Subject{

	@Override
	public void accept(Visitor visitor) {
		// TODO 自动生成的方法存根
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		// TODO 自动生成的方法存根
		return "love";
	}
	
}
