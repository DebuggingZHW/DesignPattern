package com.hw.Interpreter;

public class Minus implements Expression{

	@Override
	public int interpret(Context context) {
		// TODO 自动生成的方法存根
		return context.getNum1() - context.getNum2();
	}

}
