class A1
{
    A1 foo()
    {
        return this;
    }
    public void print()
    {
        System.out.println("Inside A1");
    }
}
class A2 extends A1
{
    A1 foo()
    {
        return this;
    }
    public void print()
    {
        System.out.println("Inside A2");
    }
}
class A3 extends A2
{
    A1 foo()
    {
        return this;
    }
    public void print()
    {
        System.out.println("Inside A3");
    }
}
class WithoutCovariant
{
    public static void main(String[] args)
    {
        A1 a1 = new A1();
        a1.foo().print();
        
        A2 a2 = new A2();
        System.out.println(a2.foo() instanceof A);

        A3 a3 = new A3();
        a3.foo().print();

    }
}