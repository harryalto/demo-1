package com.example.strategy;

import org.springframework.stereotype.Component;

@Component("DefaultPrintStrategy")
public class DefaultPrintStrategy implements IPrintStrategy {

	@Override
	public void print(String document) {
		System.out.println("DefaultPrintStrategy  [" + this + "]");

	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "DefaultPrintStrategy";
	}

}