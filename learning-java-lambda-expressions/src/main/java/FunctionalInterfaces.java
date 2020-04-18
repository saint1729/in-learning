import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        Predicate<String> isValidStringLength = (s) -> s.length() < 10;
        System.out.println(isValidStringLength.test("Alpha"));

        Consumer<String> stringConsumer = (s) -> System.out.println(s.toLowerCase());
        stringConsumer.accept("AlphaBeta");

        Function<Integer, String> intToStringConverter = (num) -> Integer.toString(num);
        System.out.println(intToStringConverter.apply(1729).length());

        Supplier<String> s = () -> "Java is fun";
        System.out.println(s.get());

        BinaryOperator<Integer> add = (a, b) -> (a + b);
        System.out.println(add.apply(8, 13));

        UnaryOperator<String> str = (msg) -> (msg == null) ? msg : msg.toUpperCase();
        System.out.println(str.apply("Alpha Beta Gamma"));

    }

}
