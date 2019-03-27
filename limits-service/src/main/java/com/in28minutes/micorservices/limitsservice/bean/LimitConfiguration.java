package com.in28minutes.micorservices.limitsservice.bean;

public class LimitConfiguration {

	private int maximun;

	private int minimun;

	public LimitConfiguration() {
	}

	public LimitConfiguration(int minimun, int maximun) {
		super();
		this.minimun = minimun;
		this.maximun = maximun;
	}

	public int getMaximun() {
		return maximun;
	}

	public int getMinimun() {
		return minimun;
	}

}
