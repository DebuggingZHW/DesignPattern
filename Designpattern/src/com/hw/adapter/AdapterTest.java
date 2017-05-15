package com.hw.adapter;

public class AdapterTest {
	public static void main(String [] args) {
		Targetable target = new Adapter();//Targetable接口的实现类具有Source类的功能
		target.method1();
		target.method2();
	}
}
