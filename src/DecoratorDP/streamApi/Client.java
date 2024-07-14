package DecoratorDP.streamApi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe", "Smith");

        //Original stream
        Stream<String> nameStream = names.stream();

        //Decorating the Stream with various operations
        Stream<String> decoratedStream = nameStream
                .filter(name -> name.startsWith("J"))
                .map(String :: toUpperCase)
                .sorted();

        List<String> result = decoratedStream.toList();
        System.out.println(result);
    }
}
