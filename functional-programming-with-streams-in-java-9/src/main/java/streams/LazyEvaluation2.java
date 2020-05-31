package streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LazyEvaluation2 {

    public static void main(String[] args) {
        Random random = new Random();

        Supplier<Integer> supplier = () -> {
            Integer n = (random).nextInt() % 100;
            System.out.println("supplied " + n);
            return n;
        };

        System.out.println("Generating Stream - Lazily");
        Stream<Integer> s = Stream.generate(supplier);
        System.out.println("Actual operations (on demand)");

        s.limit(10).filter(n -> (n > 0) && (n < 10)).forEach(System.out::println);
    }

}
