package com.damon.example.pattern.cor.chain;

public abstract class Chain {
	protected Chain successed;

	public void setSuccessed(Chain successed) {
		this.successed = successed;
	}
	
	public abstract void handle(int i);
	
}
