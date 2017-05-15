package com.hw.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject{
	private Vector<Observer> vector = new Vector<Observer>();
	
	@Override
	public void add(Observer observer) {
		// TODO 自动生成的方法存根
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		// TODO 自动生成的方法存根
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO 自动生成的方法存根
		Enumeration<Observer> enumo = vector.elements();
		while(enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}
}
