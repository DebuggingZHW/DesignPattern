package com.hw.strategy;

//策略模式，定义了一系列算法，并将每个算法封装起来，且算法的变化不会影响到使用算法的客户。
public class AbstractCalculator {
	public int[] split(String exp,String opt) {
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}