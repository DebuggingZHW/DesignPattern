package com.hw.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		String exp = "1+9";
		ICalculator cal = new Plus();
		int result = cal.calculate(exp);
		System.out.println(result);
	}
}
