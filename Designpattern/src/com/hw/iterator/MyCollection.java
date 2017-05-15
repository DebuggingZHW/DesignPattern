package com.hw.iterator;

public class MyCollection implements Collection{

	public String string[] = {"A","B","C","D","E"};
	@Override
	public Iterator iterator() {
		// TODO 自动生成的方法存根
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		// TODO 自动生成的方法存根
		return string[i];
	}

	@Override
	public int size() {
		// TODO 自动生成的方法存根
		return string.length;
	}

}
