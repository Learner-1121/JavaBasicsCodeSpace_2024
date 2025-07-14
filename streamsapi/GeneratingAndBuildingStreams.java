import java.util.stream.Stream;
import java.math.BigInteger;
public class GeneratingAndBuildingStreams
{
    public static void main(String[] args)
    {
        //factory methods to create stream

        System.out.println("Generating random numbers using Stream.generate()");
        Stream<Integer> random_numbers = Stream.generate(() -> (int) (Math.random()*10000));
        //random_numbers.forEach(System.out::println); -will not stop printing as it will generate infinite elements
        random_numbers.limit(5).forEach(System.out::println);


        System.out.println("Generating powers of two using Stream.iterate()");
        Stream<BigInteger> powersOfTwo = Stream.iterate(BigInteger.ONE, n-> n.multiply(BigInteger.TWO));
        powersOfTwo.limit(5).forEach(System.out::println);

        System.out.println("Generating alphabets using Stream.iterate()");
        Stream<Character> alphabets = Stream.iterate('A',letter -> letter <= 'Z',letter -> (char)(letter+1));
        alphabets.forEach(System.out::print);
        System.out.println();

        // follows builder design pattern to generate streams
        Stream.Builder<String> builder = Stream.builder();
        builder.add("yamini");
        builder.add("sai");
        builder.add("kamakshi");
        Stream<String> stream = builder.build();
        stream.forEach(System.out::print);
        System.out.println();

        
    }
}