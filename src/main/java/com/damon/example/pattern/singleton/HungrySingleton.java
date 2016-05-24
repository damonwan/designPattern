package com.damon.example.pattern.singleton;

public class HungrySingleton {
	
	private static HungrySingleton instance = new HungrySingleton();

	private HungrySingleton() {
	}
	
	public static HungrySingleton getInstance() {
		return instance;
	}
	
}
