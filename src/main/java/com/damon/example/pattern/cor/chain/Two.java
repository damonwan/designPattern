package com.damon.example.pattern.cor.chain;

public class Two extends Chain{
	@Override
	public void handle(int i) {
		if (i == 2) {
			System.out.println("two handle it.");
		} else {
			this.successed.handle(i);
		}
	}
}
