package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        // To take result from Streams
        List<Integer>list= Arrays.asList(1,2,3,4);

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. forEach
    }
}
