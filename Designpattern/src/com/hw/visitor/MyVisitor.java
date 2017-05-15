package com.hw.visitor;

public class MyVisitor implements Visitor{

	@Override
	public void visit(Subject sub) {
		// TODO 自动生成的方法存根
		System.out.println("visit the subject:" + sub.getSubject());
	}
}
