package com.damon.example.pattern.cor;

import com.damon.example.pattern.cor.chain.Chain;

public class Main {
	public static void main(String[] args) {
		Chain chain = ChainFactory.getChain();
		for (int i = 0; i < 10; i++) {
			chain.handle(i);
		}
	}
}
