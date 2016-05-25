package com.damon.example.pattern.template;

public class ItemOrderCreate extends CreateOrderTemplate {

	@Override
	protected void applyInventory() {
		System.out.println("item inventory apply");
	}

	@Override
	protected void createBizOrder() {
		System.out.println("item biz order create");
	}

	@Override
	protected void validParam() {
		System.out.println("item order valid");
	}

}
