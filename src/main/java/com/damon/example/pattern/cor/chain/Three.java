package com.damon.example.pattern.cor.chain;

public class Three extends Chain{
	@Override
	public void handle(int i) {
		if (i == 3) {
			System.out.println("three handle it.");
		} else {
			System.out.println("no one handle it.");
		}
	}
}
