import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsAPI
{
    public static void main(String[] args)
    {
        List<Integer> salaries = Arrays.asList(10000,2000,3000,8000,9000);
        List<Integer> salaries_greater_than_3000 = salaries.stream().filter(salary -> salary > 3000).collect(Collectors.toList());
        System.out.println(salaries_greater_than_3000);
        
        //count
        System.out.println(salaries.stream().filter(salary -> salary > 3000).count());

        System.out.println(salaries.stream().filter(salary -> salary > 3000).mapToInt(Integer::intValue).sum());
         System.out.println(salaries.stream().filter(salary -> salary > 3000).mapToInt(Integer::intValue).average().orElse(0));



    }
}