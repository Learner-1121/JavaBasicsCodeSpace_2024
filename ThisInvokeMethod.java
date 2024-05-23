class A
{
    void m()
    {
        System.out.println("Inside m");
        n(); //compiler automatically adds this.n()
        this.n();
    }
    void n()
    {
        System.out.println("Inside n");
    }
}
class TestThisInvokingMethod
{
    public static void main(String[] args)
    {
        A a = new A();
        a.m();
    }
}