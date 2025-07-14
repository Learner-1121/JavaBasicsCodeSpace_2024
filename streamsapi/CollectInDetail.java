import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

public class CollectInDetail
{
    public static void main(String[] args)
    {
        List<String> fruits = Arrays.asList("apple","mango","guava","mango","apple");
        HashMap<String,Integer> res = fruits.stream().collect(HashMap::new, (result,key) -> 
        result.merge(key,1,Integer::sum), HashMap::putAll);
        System.out.println(res);

       Map<String,Integer> chm = fruits.parallelStream().filter(fruit ->{
        System.out.println(fruit);
        return true;
       }).collect(ConcurrentHashMap::new, (map,key) -> map.merge(key,1,Integer::sum), ConcurrentHashMap::putAll);
        System.out.println(chm);

        //collect(supplier,accumulator,combiner);
    }
}