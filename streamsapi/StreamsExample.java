import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample
{
    public static void main(String[] args)
    {
        List<Integer> arr = Arrays.asList(1,3,4,5);
        System.out.println(arr.stream().mapToInt(num -> (int) num).average());

        //searching in streams
        System.out.println(arr.stream().findFirst());
        System.out.println(arr.stream().filter(num -> num%2==0).findFirst());
           // ---> return first element in stream that matches criteria.

        System.out.println(arr.stream().filter(num -> num%2==1).findAny());
    

        // just want to know if any element exists anyMatch(predicate) returns true or false
        System.out.println(arr.stream().anyMatch(num -> num%2==0));

        // want to know all elements in the stream are matching criteria - allMatch()
        System.out.println(arr.stream().allMatch(num -> num%2==0));

        // returns true if none of the elements Matches the criteria - noneMatch()
        System.out.println(arr.stream().noneMatch(num -> num>20));
        System.out.println(arr.stream().noneMatch(num -> num%2==0));


        // noneMatch() = !allMatch();

        
        

    }
    
}