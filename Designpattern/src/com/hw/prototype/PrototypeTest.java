package com.hw.prototype;

//原型模式
public class PrototypeTest {
	public static void main(String [] args) {
		ConcretePrototype cp = new ConcretePrototype();
		ConcretePrototype clonecp = null;
		for (int i = 0; i < 10; i++) {
			try {
				clonecp = (ConcretePrototype)cp.clone();//复制原型
			} catch (CloneNotSupportedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			clonecp.show();
		}
	}
}
