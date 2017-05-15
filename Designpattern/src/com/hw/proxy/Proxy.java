package com.hw.proxy;

//代理模式，采用代理类调用原有的方法，将功能划分得更清晰，有利于后期维护
public class Proxy implements Sourceable{
	private Source source;
	public Proxy() {
		super();
		this.source = new Source();
	}
	@Override
	public void method() {
		// TODO 自动生成的方法存根
		before();
		source.method();
		after();
	}
	
	private void before() {
		System.out.println("before proxy");
	}
	
	private void after() {
		System.out.println("after proxy");
	}
	
}
