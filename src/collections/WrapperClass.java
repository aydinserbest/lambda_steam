package collections;

public class WrapperClass {
    public static void main(String[] args) {
        int number =5;
        Integer num = number;
        System.out.println(num);
        number = 6;
        System.out.println(num);

        int number2 = num;
        System.out.println(number2);
    }
}
