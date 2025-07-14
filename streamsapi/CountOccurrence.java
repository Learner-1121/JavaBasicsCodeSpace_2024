
import java.util.stream.Stream;
public class CountOccurrence
{
    public static void main(String[] args)
    {
        Stream<String> words_list = Stream.of("yamini","is","a","good","girl");

        //words_list.map(word -> count(word,'i')).forEach(System.out::println);
        String word = "yamini";
        System.out.println(word.chars().filter(c -> c=='i').count());
    }
    public static Integer count(String word, Character character)
    {
        int count = 0;
        for(Character letter: word.toCharArray())
            if(character.equals(letter))
                count++;
        return count;
    }
}