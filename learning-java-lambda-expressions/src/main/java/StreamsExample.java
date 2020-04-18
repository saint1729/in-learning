import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {

        Arrays.asList("red", "green", "blue")
                .stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        Stream.of("apple", "pear", "banana", "cherry", "apricot")
                .filter(fruit -> {
//                    System.out.println(fruit);
                    return fruit.startsWith("a");
                })
                .forEach(System.out::println);

        List<String> collected = Stream.of("Alpha", "Beta")
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(collected.toString());

    }


}
