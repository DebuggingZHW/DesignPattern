package com.hw.decorator;

//装饰者模式，Source类是被装饰类，Decorator是装饰类，可以为Source类动态添加一些功能
public class Decorator implements Sourceable{
	private Sourceable source;
	
	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		// TODO 自动生成的方法存根
		System.out.println("执行decorator前");
		source.method();
		System.out.println("执行decorator后");
	}
	
}
