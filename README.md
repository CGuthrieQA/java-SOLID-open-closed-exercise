# SOLID

## Open / Closed

### Exercises

Consider the god-class Greeter.java, which is meant to return a greeting message depending on the type selected:

```java
public class Greeter{
    private String greetingType;

    public String greet(){
        if ("formal".equals(this.greetingType)){
            return "Good evening, Sir.";
        }
        else if ("casual".equals(this.greetingType)) {
            return "Sup m8?";
        }
        else {
            return "Hello";
        }
    }

    public void setGreetingType(String greetingType) {
        this.greetingType = greetingType;
    }
}
```

Greeter.java violates the Open/Closed Principle, because any time we would want to change the style of greeting, we would have to change the functionality of greet() every single time.

Implement the following classes and/or interfaces to complete this exercise:

* Greeting.java
* FormalGreeting.java
* CasualGreeting.java
* Greeter.java

```java
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

```

```java
package com.qa.main;

public class CasualGreeting implements Greeting {

	public String words() {
		return "Sup m8?";
	}
	

}

```

```java
package com.qa.main;

public class FormalGreeting implements Greeting {

	public String words() {
		return "Good evening, Sir.";
	}

}

```

```java
package com.qa.main;

public interface Greeting {
	
	public String words();

}

```

```java
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

```