package com.hw.singleton;

public class SingletonTest {
	public static void main(String [] args) {
		//饿汉单例模式测试
		SingletonHunger singletonHunger1 = SingletonHunger.getInstance();
		SingletonHunger singletonHunger2 = SingletonHunger.getInstance();
		
		if (singletonHunger1.equals(singletonHunger2)) {
			System.out.println("singletonHunger1和singletonHunger2是同一个实例（饿汉单例模式测试）");
		} else {
			System.out.println("singletonHunger1和singletonHunger2不是同一个实例（饿汉单例模式测试）");
		}
		
		//懒汉单例模式测试
		SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
		SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
		
		if (singletonLazy1.equals(singletonLazy2)) {
			System.out.println("singletonLazy1和singletonLazy2是同一个实例（懒汉单例模式测试）");
		} else {
			System.out.println("singletonLazy1和singletonLazy2不是同一个实例（懒汉单例模式测试）");
		}
	}
}
