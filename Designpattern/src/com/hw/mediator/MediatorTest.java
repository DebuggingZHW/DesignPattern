package com.hw.mediator;

//中介者模式，降低类与类之间的耦合，有点类似spring的容器
public class MediatorTest {
	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
