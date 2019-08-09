package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Advantage of optional is we can avoid Null pointer exception
//Whenever we smell that we can get Null pointer exception then we can
//avoid it by using Optional check
//But in this case if optional return nothing then we get NoSuchElement Exception
//Java 9 minimize the chances by using IfPresentOrElse method
//IfPresentOrElse - will return a primitive value
//ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)
//or - will return any optional
public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        /*System.out.println(numbers.stream()
                        .filter(e -> e>5)
                        .findFirst());
        System.out.println(numbers.stream()
                .filter(e -> e>5)
                .findFirst().get());
        System.out.println(numbers.stream()
                .filter(e -> e>50)
                .findFirst());
        //Don;t use get
        System.out.println(numbers.stream()
                .filter(e -> e>50)
                .findFirst().orElse(0));*/

        //Java 9
        Optional<Integer> first
                = numbers.stream().filter(e -> e > 5).findFirst();
        first.ifPresentOrElse(e -> System.out.println(e),
                () -> System.out.println("nope"));

        Optional<Integer> second
                = numbers.stream().filter(e -> e > 50).findFirst();
        second.ifPresentOrElse(e -> System.out.println(e),
                () -> System.out.println("nope"));

        Optional<Integer> third
                = numbers.stream().filter(e -> e > 50).findFirst()
                .or(() -> Optional.of(77));
        System.out.println(third);
    }
}
