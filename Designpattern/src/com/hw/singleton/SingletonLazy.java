package com.hw.singleton;

//懒汉，线程安全
public class SingletonLazy {
	//持有私有静态实例，防止被引用。初始化赋值为null，目的是实现延迟加载
	private static SingletonLazy instance = null;
	
	//私有构造方法，防止被实例化
	private SingletonLazy() {
		
	}
	
	//静态工程方法，创建实例
	public static SingletonLazy getInstance() {
		if (instance == null) {
			/*synchronized (instance) { //同步锁，应对多线程环境
				if (instance == null) {
					instance = new SingletonLazy();
				}
			}*/
			instance = new SingletonLazy();
		}
		
		return instance;
	}
	
	//用于保证该对象在序列化前后保持一致
	public Object readResolve() {
		return instance;
	}
}
