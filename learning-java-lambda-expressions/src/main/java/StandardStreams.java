import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StandardStreams {

    public static void main(String[] args) {

        IntStream.range(1, 4)
                .forEach(System.out::println);

        Arrays.stream(new int[]{1, 2, 3, 4})
                .map(n -> n * n)
                .average()
                .ifPresent(System.out::println);

        Stream.of(1.5, 2.3, 3.7)
                .mapToInt(Double::intValue)
                .forEach(System.out::println);

    }

}
