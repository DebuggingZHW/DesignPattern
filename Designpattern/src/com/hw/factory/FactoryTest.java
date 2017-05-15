package com.hw.factory;

//测试类，工厂方法模式
public class FactoryTest {
	public static void main(String [] args) {
		Provider provider = new SendMailFactory();//创建工厂实例
		Sender sender = provider.produce();
		sender.send();
	}
}
