package com.damon.example.pattern.observer;

public class MessageObserver implements Observer {
	
	private String name;
	
	public MessageObserver(String name) {
		this.name = name;
	}

	@Override
	public void update(Subject subject) {
		String msg = ((NoticeSubject)subject).getMsg();
		System.out.println(name + ":" + msg);
	}

}
