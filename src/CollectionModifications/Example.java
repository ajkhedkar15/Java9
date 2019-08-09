package CollectionModifications;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Before Java 9 whenever we need to add items in collection we generally use Arrays.asList()
//When we get the class its an ArrayList
//In Java 9 we can use List.of() method which will gives us an immutable list
public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(numbers.getClass());
        //class java.util.Arrays$ArrayList

        //Java9
        List<Integer> numbers2 = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(numbers2.getClass());
        //class java.util.ImmutableCollections$ListN

        //Immutable collection
        //numbers2.add(11);//CollectionModifications Exception

        List<Integer> twoNumbers = List.of(2,4);
        System.out.println(twoNumbers.getClass());
        //class java.util.ImmutableCollections$List2

        List<Integer> number = List.of(7);
        System.out.println(number.getClass());
        //class java.util.ImmutableCollections$List1

        List<Integer> empty = List.of();
        System.out.println(empty.getClass());
        //class java.util.ImmutableCollections$List0

        Set<String> names = Set.of("John", "Sara", "tom");
        System.out.println(names.getClass());
        //class java.util.ImmutableCollections$SetN

        Set<String> names2 = Set.of("John", "Sara");
        System.out.println(names2.getClass());
        //class java.util.ImmutableCollections$Set2

        System.out.println(Map.of(1, "A", 2,"B",3, "C"));
        //System.out.println(Map.of(1, "A", 2,"B",3, ));
        //Compile time error
    }
}
