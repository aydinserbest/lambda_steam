package lambda;

@FunctionalInterface
public interface SingleMethod {
    void doSomething();
    //void doSomethingElse(); you can't add a second abstract method
}
/*
it takes only 1 abstract method
you can not add a second abstract method
it gives error
 */