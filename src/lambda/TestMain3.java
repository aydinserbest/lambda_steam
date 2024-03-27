package lambda;

public class TestMain3 {
    public static void main(String[] args) {

        //intellij helps us with the following code
//        Human lambda = new Human() {
//            @Override
//            public void credentials(String firstName, String lastName, int age) {
//
//            }
//        };
        /*
        //Position your cursor right after the parentheses (() following the Human interface,
        you'll observe a yellow light bulb icon appearing on the left side in IntelliJ IDEA.
        Upon clicking that light bulb, a dropdown will present several options,
        one of them being 'Replace with lambda'.
        By selecting 'Replace with lambda',
        IntelliJ IDEA will automatically convert the anonymous class method to a lambda expression.
         */
        Human lambda = (firstName, lastName, age) -> System.out.println(firstName + " " + lastName + " " + age);
    }
}
