import java.util.stream.Stream;
public class SliceWord
{
    public static void main(String[] args)
    {
        int start = 2;
        int end = 5;
        String word = "letters";
        word.chars().skip(start).limit(end-start).map(c -> (char)c).forEach(System.out::print);
    }
}