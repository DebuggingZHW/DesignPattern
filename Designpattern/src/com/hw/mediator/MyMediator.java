package com.hw.mediator;

public class MyMediator implements Mediator{
	private User user1;
	private User user2;
	
	@Override
	public void createMediator() {
		// TODO 自动生成的方法存根
		user1 = new User1(this);
		user2 = new User2(this);
	}

	@Override
	public void workAll() {
		// TODO 自动生成的方法存根
		user1.work();
		user2.work();
	}
}
