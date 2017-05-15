package com.hw.command;

//命令模式，使命令的发出者和执行者解耦，实现请求和执行分开
public class CommandTest {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command cmd = new MyCommand(receiver);
		Invoker invoker = new Invoker(cmd);
		invoker.action();
	}
}
