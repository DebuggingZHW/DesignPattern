package com.hw.responsibility;

//责任链模式，每个对象持有对下一个对象的引用，形成一条链，请求在这条链上传递
public class ResponsibilityTest {
	public static void main(String[] args) {
		Myhandler h1 = new Myhandler("h1");
		Myhandler h2 = new Myhandler("h2");
		Myhandler h3 = new Myhandler("h3");
		
		h1.setHandler(h2);
		h2.setHandler(h3);
		h1.operator();
		
	}
}
