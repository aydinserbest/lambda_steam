package lambda;

public class TestMain4 {
    public static void main(String[] args) {

    /*
    In the specific context of single-line lambda expressions,
    the return keyword is not necessary. Java implicitly understands that
    the result of that single expression should be returned.
    Therefore, you can write your lambda as follows:
     */
        NameOfHuman nameOfHuman = name -> name.toUpperCase();  // if you give me -n-, i will turn it to uppercase
        //or
        //NameOfHuman = String::toUpperCase;

    /*
    If you have a lambda expression that contains more than one statement,
    or if you need to use a return statement,
    you must use curly braces {} to denote a block of code.
     */
        NameOfHuman nameOfHuman2 = name -> {
            // Some other code...
            return name.toUpperCase();
        };
        System.out.println(nameOfHuman2.getName("John"));

    }
}
