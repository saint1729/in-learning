import java.util.function.Consumer;
import java.util.function.IntFunction;

public class CustomFunctionalInterfaces {

    public static void main(String[] args) {

        IntCalculate add = Integer::sum;
        IntCalculate difference = (a, b) -> Math.abs(a - b);
        IntCalculate divide = (a, b) -> ((b != 0) ? (a / b) : 0);
        IntCalculate multiply = (a, b) -> (a * b);

        IntFunction<String> intToString = Integer::toString;
        Consumer<String> printer = System.out::println;

        printer.accept(intToString.apply(add.calc(1, 2)));
        printer.accept(intToString.apply(difference.calc(1, 2)));
        printer.accept(intToString.apply(divide.calc(4, 2)));
        printer.accept(intToString.apply(divide.calc(1, 2)));
        printer.accept(intToString.apply(divide.calc(1, 0)));
        printer.accept(intToString.apply(multiply.calc(3, 4)));

    }

}
