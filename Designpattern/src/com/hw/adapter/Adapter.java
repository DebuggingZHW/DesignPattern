package com.hw.adapter;

//适配器模式，实现Targetable接口，继承Source方法。通过Adapter类，将Source的功能扩展到Targetable里
public class Adapter extends Source implements Targetable{

	@Override
	public void method2() {
		// TODO 自动生成的方法存根
		System.out.println("这是Targetable接口的实现方法!");
	}
}
