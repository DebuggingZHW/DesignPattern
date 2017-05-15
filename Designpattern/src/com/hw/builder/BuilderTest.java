package com.hw.builder;

public class BuilderTest {
	public static void main(String [] args) {
		Builder builder = new Builder();
		builder.produceMailSender(5);
		System.out.println("");
		builder.produceSmsSender(5);
	}
}
