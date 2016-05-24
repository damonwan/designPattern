package com.damon.example.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class NoticeSubject extends Subject {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
		this.notifyObserver();
	}
}
