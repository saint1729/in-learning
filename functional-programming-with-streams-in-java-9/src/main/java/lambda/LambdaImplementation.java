package lambda;

import java.util.function.Consumer;

public class LambdaImplementation {


    public static void main(String[] args) {

        System.out.println("\nAnonymous class:");
        for(int i = 0; i < 5; i++) {
            Consumer<String> myPrinter = new Consumer<String>() {
                @Override
                public void accept(String s) {
                    System.out.println("Consuming " + s);
                }
            };
            myPrinter.accept(myPrinter.toString());
        }

        System.out.println("\nNon-capturing lambda:");
        for (int i = 0; i < 5; i++) {
            Consumer<String> myPrinter = s -> System.out.println("Consuming " + s);
            myPrinter.accept(myPrinter.toString());
        }

        System.out.println("\nConstant-capturing lamdba:");
        final int secret = 42;
        for (int i = 0; i < 5; i++) {
            Consumer<String> myPrinter = s -> System.out.println("Consuming " + s + ", " + secret);
            myPrinter.accept(myPrinter.toString());
        }

        foo();

    }

    public static void foo() {
        System.out.println("\nInstance-capturing lamdba:");
        int id = 1;
        for (int i = 0; i < 5; i++) {
            Consumer<String> myPrinter = s -> System.out.println("Consuming " + s + ", " + id);
            myPrinter.accept(myPrinter.toString());
        }
    }


}
