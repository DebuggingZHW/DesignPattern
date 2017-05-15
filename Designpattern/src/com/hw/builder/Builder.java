package com.hw.builder;

import java.util.ArrayList;
import java.util.List;

import com.hw.factory.MailSender;
import com.hw.factory.Sender;
import com.hw.factory.SmsSender;

//建造者模式，复用了工厂模式中的Sender接口，将各种产品集中进行管理，用于创建复合对象
public class Builder {
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count) {
		for (int i = 0; i < count; i ++) {		
			list.add(new MailSender());
		}
		System.out.println(list);
	}
	
	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i ++) {
			list.add(new SmsSender());
		}
		System.out.println(list);
	}
}
