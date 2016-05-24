package com.damon.example.pattern.observer;

public class Main {
	public static void main(String[] args) {
		NoticeSubject subject = new NoticeSubject();
		
		Observer observer1 = new MessageObserver("one");
		Observer observer2 = new MessageObserver("two");
		Observer observer3 = new MessageObserver("three");

		subject.attach(observer1);
		subject.attach(observer2);
		subject.attach(observer3);
		
		subject.setMsg("good");
	}
}
