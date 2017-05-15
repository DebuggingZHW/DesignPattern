package com.hw.iterator;

//迭代器模式，顺序访问聚集中的对象
public class MyIterator implements Iterator{
	private Collection collection;
	private int pos = -1;
	
	public MyIterator(Collection collection) {
		this.collection = collection;
	}

	@Override
	public Object previous() {
		// TODO 自动生成的方法存根
		if(pos > 0) {
			pos --;
		}
		
		return collection.get(pos);
	}

	@Override
	public Object next() {
		// TODO 自动生成的方法存根
		if (pos < collection.size() - 1) {
			pos ++;
		}
		
		return collection.get(pos);
	}

	@Override
	public boolean hasNext() {
		// TODO 自动生成的方法存根
		if (pos < collection.size() - 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object first() {
		// TODO 自动生成的方法存根
		pos = 0;
		return collection.get(pos);
	}
	
	
}
