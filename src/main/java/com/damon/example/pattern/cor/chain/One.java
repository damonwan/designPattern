package com.damon.example.pattern.cor.chain;

public class One extends Chain {

	@Override
	public void handle(int i) {
		if (i == 1) {
			System.out.println("one handle it.");
		} else {
			this.successed.handle(i);
		}
	}

}
