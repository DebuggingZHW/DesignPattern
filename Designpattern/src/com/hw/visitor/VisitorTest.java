package com.hw.visitor;

//访问者模式，将数据结构和作用于结构上的操作解耦合
public class VisitorTest {
	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);
	}
}
