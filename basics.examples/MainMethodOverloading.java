public class MainMethodOverloading{
    public static void main()
    {
        System.out.println("inside main()");
    }
    public static void main(String[] args)
    {
        System.out.println("inside main(String[] args)");
        main();
    }
}