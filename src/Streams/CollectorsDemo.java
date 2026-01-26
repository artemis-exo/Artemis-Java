package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // Collectors is a utility class
        // provides a set of methods to create common collectors

        List<String> names= Arrays.asList("Alice", "Bob", "Charlie");
        List<String>res= names.stream()
                .filter(name->name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
