package com.example.strategy;

import org.springframework.stereotype.Component;

@Component("PrintA5Strategy")
public class PrintA5Strategy implements IPrintStrategy {

	@Override
	public void print(String document) {
		System.out.println("PrintA5Strategy  [" + this + "]");

	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "PrintA5Strategy";
	}

}
