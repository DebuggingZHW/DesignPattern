package com.hw.abstractFac;

public class SendSmsFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO 自动生成的方法存根
		return new SmsSender();
	}
	
}
