package com.junit.demo1;

public class GreetingImpl implements Greeting {

	@Override
	public String greet(String name) {
		
		if(name==null || name.length() ==0 || name.equals(" "))
			throw new IllegalArgumentException();
		
		return "Hello "+name;
	}

}
