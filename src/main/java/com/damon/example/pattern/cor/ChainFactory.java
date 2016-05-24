package com.damon.example.pattern.cor;

import com.damon.example.pattern.cor.chain.Chain;
import com.damon.example.pattern.cor.chain.One;
import com.damon.example.pattern.cor.chain.Three;
import com.damon.example.pattern.cor.chain.Two;

public class ChainFactory {
	
	public static Chain getChain() {
		One one = new One();
		Two two = new Two();
		Three three = new Three();
		
		one.setSuccessed(two);
		two.setSuccessed(three);
		
		return one;
	}
}
