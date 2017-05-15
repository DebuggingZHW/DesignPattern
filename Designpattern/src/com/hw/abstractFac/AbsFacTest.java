package com.hw.abstractFac;

//抽象工厂模式，与工厂模式不同的是它创建了多个工厂类，这样一旦需要增加新功能，直接增加新的工厂类就行
public class AbsFacTest {
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.send();
	}
}
