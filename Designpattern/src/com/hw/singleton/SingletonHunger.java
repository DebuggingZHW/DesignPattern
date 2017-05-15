package com.hw.singleton;

//饿汉，类加载已经初始化，不存在多线程问题，不需要同步
public class SingletonHunger {
	//持有私有静态实例，防止被引用。
	private static SingletonHunger instance = new SingletonHunger();
	
	//私有构造方法，防止被实例化
	private SingletonHunger() {
		
	}
	
	//静态工程方法，创建实例
	public static SingletonHunger getInstance() {
		return instance;
	}
	
	//用于保证该对象在序列化前后保持一致
	public Object readResolve() {
		return instance;
	}
}


