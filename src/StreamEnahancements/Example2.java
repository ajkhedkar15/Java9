package StreamEnahancements;

import java.util.stream.IntStream;

//IntStream enhancements
public class Example2 {
    public static void main(String[] args) {
        //IntStream.range(0,5).forEach(System.out::println);

        //Java 8
       /* for (int i=0; i<5; i=i+2){
            System.out.println(i);
        }*/

       //Java 9
        //iterate(seed, predicate, function)
        IntStream.iterate(0, i -> i<=5, i -> i+2)
                .forEach(System.out::println);

        IntStream.iterate(0,i -> i+2)
                .limit(3)  //dropWhile, takeWhile, skip.......
                .forEach(System.out::println);
    }
}
