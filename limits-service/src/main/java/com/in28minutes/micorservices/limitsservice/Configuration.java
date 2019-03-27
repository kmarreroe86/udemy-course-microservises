package com.in28minutes.micorservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	
	private int minimun;

	private int maximun;
	
	public int getMaximun() {
		return maximun;
	}

	public int getMinimun() {
		return minimun;
	}

	public void setMaximun(int maximun) {
		this.maximun = maximun;
	}

	public void setMinimun(int minimun) {
		this.minimun = minimun;
	}
	
	
	

}
