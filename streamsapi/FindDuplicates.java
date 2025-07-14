
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Stream;
public class FindDuplicates
{
    public static void main(String[] args)
    {
        Stream<Integer> integer_stream = Stream.of(1,3,5,2,4,1,3,5);

        Set<Integer> elements = new HashSet<>();
        /*
        integer_stream.filter(
            num -> {
                if(elements.contains(num))
                    return true;
                else{
                    elements.add(num);
                    return false;
                }
            }
        )
        .forEach(System.out::println);
        */
        //simplified version

        integer_stream.filter(num -> !elements.add(num)).forEach(System.out::println);
    }
}