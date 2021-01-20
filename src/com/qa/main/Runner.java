package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();

		Greeting formal = new FormalGreeting();
		
		Greeting casual = new CasualGreeting();
		
		greeter.setGreeting(formal);
		
		System.out.println(greeter.words());

		greeter.setGreeting(casual);
		
		System.out.println(greeter.words());
		
		
	}

}
