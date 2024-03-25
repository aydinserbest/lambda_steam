package lambda;

public class TestMain {
    public static void main(String[] args) {

        // lamb expression is an implementation of an interface
        //only condition is , that interface must have only 1 abstract method
        //if it has more than 1 abstract method , it will not work
        GreetingService greet1 = new GreetingService() {
            @Override
            public void sayMessage(String message) {
                System.out.println(message);
            }
        };
        GreetingService greet2 = new GreetingService() {
            @Override
            public void sayMessage(String message) {
                System.out.println(message);
            }
        };
        //lambda expression
        //remove from =. until parameter and add ->

        GreetingService greet3 = (String message) -> {
            System.out.println(message);
        };
        //if it has 1 line , remove {}
        GreetingService greet4 = (String message) -> System.out.println(message);

        //parameter type is optional, you can remove it
        GreetingService greet5 = (message) -> System.out.println(message);
        //because GreetingService has only 1 method and 1 parameter, it is String (for this example)

        //if it is 1 parameter , you can remove ()
        GreetingService greet6 = message -> System.out.println(message);

        GreetingService greet7 = System.out::println;
        greet3.sayMessage("Hello");

        //////////////

        Pet animals = animal -> animal.makeSound();
        //animal variable represents the parameter of the method inside Pet interface
        //it can be written horse,dog,anything
        //only condition before and after -> should be the same variable

    }
}
