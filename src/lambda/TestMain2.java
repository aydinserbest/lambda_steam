package lambda;

public class TestMain2 {
    public static void main(String[] args) {
        //lambda can have multiple parameters:

        /*
        Firstly, the Human here is a Functional Interface.
        Lambda expressions introduced in Java 8 allow us
        to perform operations on interfaces that have a single abstract method.
        This serves you as an inline implementation of the abstract method.
        Meaning, it has a single method credentials
        and you're providing an on-the-spot implementation of it
          */

        Human human = (fn, ln, age) -> {
            System.out.println(fn);
            System.out.println(ln);
            System.out.println(age);
        };
        /*
        The given lambda expression (fn, ln, age) -> {...}
        forms the implementation of the credentials method of the Human interface.
        It takes the parameters firstName, lastName, and age and prints out each of these values.
         */
        human.credentials("John", "Doe", 30);
        }
    }
    /*\Lastly, with the human.credentials("John", "Doe", 30); code line,
    you're calling this lambda expression (credentials method) with the specified parameters and executing it.
In a nutshell,
what you're doing here is defining the implementation of the credentials method
on a lambda of type Human.
This implementation is then called and executed with specific parameters.
It allows you to define a specific behavior to that method or generally to a functional interface.
This behavior can be later used in a specific context.
     */

