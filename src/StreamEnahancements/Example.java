package StreamEnahancements;

import java.util.Arrays;
import java.util.List;


public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //Java 8
        numbers.stream().limit(3).forEach(System.out::println);
        System.out.println("****************");
        numbers.stream().skip(3).forEach(System.out::println);;

        //Java 9
        numbers.stream().dropWhile(e -> e < 5).forEach(System.out::println);
        System.out.println("****************");
        numbers.stream().takeWhile(e -> e < 5).forEach(System.out::println);
        //dropWhile(), takeWhile() acts as Break and Continue statements
    }
}
