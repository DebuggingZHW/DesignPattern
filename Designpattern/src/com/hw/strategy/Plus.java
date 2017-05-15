package com.hw.strategy;

public class Plus extends AbstractCalculator implements ICalculator{

	@Override
	public int calculate(String exp) {
		// TODO 自动生成的方法存根
		int arrayInt[] = split(exp, "\\+");
		return arrayInt[0] + arrayInt[1];
	}
	
}
