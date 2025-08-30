package com.tnsif.samplespring;

public class Food implements Shopping{
	@Override
	public void order() {
		System.out.println("I have ordered my lunch..");
	}
}
