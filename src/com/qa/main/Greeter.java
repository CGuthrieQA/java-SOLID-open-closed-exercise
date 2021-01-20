package com.qa.main;

public class Greeter {
	
//    private String greetingType;
//
//    public String greet(){
//        if ("formal".equals(this.greetingType)){
//            return "Good evening, Sir.";
//        }
//        else if ("casual".equals(this.greetingType)) {
//            return "Sup m8?";
//        }
//        else {
//            return "Hello";
//        }
//    }
//
//    public void setGreetingType(String greetingType) {
//        this.greetingType = greetingType;
//    }
	
	
	private Greeting greeting;

	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	
	public String words() {
		return this.greeting.words();
	}
	
	
}
