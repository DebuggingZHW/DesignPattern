package com.hw.Interpreter;

//解释器模式
public class InterpreterTest {
	public static void main(String[] args) {
		int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}
