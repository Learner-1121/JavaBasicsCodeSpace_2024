@FunctionalInterface
interface FunctionalInterfaceTest
{
    public void show();
    default void show1(){
        System.out.println("Default show method");
    }
    default int add(int a,int b)
    {
        return a+b;
    }
    default int multiply(int a,int b)
    {
        return a*b;
    }
}
class FunctionalInterfaceExample
{
    public static void main(String[] args)
    {
        FunctionalInterfaceTest t = ()->System.out.println("Abstract method show invoked ... ");
        t.show();
        t.show1();
        System.out.println(t.add(1,2));
        System.out.println(t.multiply(1,3));
    }
}