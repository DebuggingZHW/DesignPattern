package com.hw.memento;

//备忘录模式，保存一个对象的某个状态，以便在适当的时候恢复对象
public class MementoTest {
	public static void main(String[] args) {
		//创建原始类
		Original orig = new Original("han");
		
		//创建备忘录
		Storage storage = new Storage(orig.createMemento());
		
		//修改原始类的状态
		System.out.println("初始化状态：" + orig.getValue());
		orig.setValue("wei");
		System.out.println("修改后状态：" + orig.getValue());
		
		//恢复原始类的状态
		orig.restoreMemento(storage.getMemento());
		System.out.println("恢复后状态:" + orig.getValue());
	}
}
