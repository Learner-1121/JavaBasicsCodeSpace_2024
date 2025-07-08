
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class ReducingAndCollecting
{
    public static void main(String[] args)
    {
        List<String> arr = Arrays.asList("abc","def","ghi");
        ArrayList<String> words_with_vowels = new ArrayList<>();
        

        //Violates the functional programming principle of not having side effects in functions because
        // the function that ew passed to forEach() her in the form of a method reference 
        //  has the side effect of modifying the list.This won't work correctly if the
        // stream you are using is parallel stream
    
        arr.stream().filter((string) -> string.matches(".*[aeiou].*")).map(string -> "word: "+string)
        .forEach(words_with_vowels::add);

        System.out.println(words_with_vowels);

        // better way is to use collect()

        List<String> words_containing_vowels =
        arr.stream().filter(string -> string.matches(".*[aeiou].*")).collect(Collectors.toList());

        System.out.println(words_containing_vowels);

        
    }
}