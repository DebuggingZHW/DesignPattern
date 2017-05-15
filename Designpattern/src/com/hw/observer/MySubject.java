package com.hw.observer;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		// TODO 自动生成的方法存根
		System.out.println("更新自身方法");
		notifyObservers();
	}

}
