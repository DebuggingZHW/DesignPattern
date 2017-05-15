package com.hw.command;

//命令
public class MyCommand implements Command{
	private Receiver receiver;
	
	public MyCommand(Receiver receiver) {
		// TODO 自动生成的构造函数存根
		this.receiver = receiver;
	}
	@Override
	public void exe() {
		// TODO 自动生成的方法存根
		receiver.action();
	}
	

}
