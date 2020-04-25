package io.javabrains;

public class Greeter {

    public void greet(Greeting greeting) {
       greeting.perform();
    }

    public static void main (String[] args){
        Greeter greeter = new Greeter();
        HelloWorldGreeting greeting = new HelloWorldGreeting();
        greeter.greet(greeting);

        Greeting myLambdaFunction = () -> System.out.println("Hello World");

    }

}
