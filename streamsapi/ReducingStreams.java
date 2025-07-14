import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
public class ReducingStreams
{
    public static void main(String[] args)
    {

        // reduce(BinarOperator<T,T>)
        List<Integer> arr = Arrays.asList(1,2,3,4);
        Optional<Integer> opt= arr.stream().reduce((a,b) -> a+=b);

        opt.ifPresentOrElse(
            total -> System.out.printf("The total value of all elements is: %3d\n",total),
            () -> System.out.println("There are no elements in stream")
        );
        
        // reduce(default if null, BinaryOperator<T,T>)
        Integer total = arr.stream().reduce(0,(a,b) -> a+=b);
        System.out.println(total);

        // U reduce(U identity, BiFunction<U,? super T,U>,BinaryOperator<U> combiner)
        Integer total2 = arr.stream().reduce(0,(a,b) -> a+=b, (a,b) -> a+=b);
        System.out.println(total2);

        
        List<String> fruits = Arrays.asList("apple","apple","banana","banana","banana","orange");
        Map<String, Long> frequencyMap = fruits.stream().collect(Collectors.groupingBy(
            Function.identity(),
            Collectors.counting()
        ));

        System.out.println(frequencyMap);

        Map<String, Integer> fMap = fruits.stream().collect(Collectors.toMap(fruit -> fruit,fruit -> 1, Integer::sum));
        System.out.println(fMap);
    }
}