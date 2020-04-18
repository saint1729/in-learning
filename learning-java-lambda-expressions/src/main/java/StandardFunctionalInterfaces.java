import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class StandardFunctionalInterfaces {

    public static void main(String[] args) {

        IntFunction<String> intToString = num -> Integer.toString(num);
        System.out.println(intToString.apply(1729).length());

        IntFunction<String> intToString2 = Integer::toString;
        System.out.println(intToString2.apply(1729).length());

        Function<String, BigInteger> stringToBigInteger = BigInteger::new;
        System.out.println(stringToBigInteger.apply("421450324099389827598327593298787537298573985"));

        Consumer<String> print = System.out::println;
        print.accept("Consuming alpha beta");

        UnaryOperator<String> makeGreeting = "Hello, "::concat;
        print.accept(makeGreeting.apply("saint1729"));

    }

}
