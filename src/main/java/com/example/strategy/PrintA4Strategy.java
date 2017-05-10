package com.example.strategy;

import org.springframework.stereotype.Component;

@Component("PrintA4Strategy")
public class PrintA4Strategy implements IPrintStrategy {

	@Override
	public void print(String document) {
		System.out.println("PrintA4Strategy  [" + this + "]");
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "PrintA4Strategy";
	}

}
