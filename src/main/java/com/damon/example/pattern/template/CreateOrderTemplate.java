package com.damon.example.pattern.template;

public abstract class CreateOrderTemplate {
	
	final public void createOrder() {
		validParam();
		createPaymentOrder();
		freezeAssets();
		createBizOrder();
		applyInventory();
	}

	protected abstract void applyInventory();

	protected abstract void createBizOrder();

	private void freezeAssets() {
		System.out.println("freeze user assets");
	}

	private void createPaymentOrder() {
		System.out.println("create payment order");
	}

	protected abstract void validParam();
}
