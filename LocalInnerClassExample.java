class LocalInnerClass
{
    private int data = 20;
    void disp()
    {
        class Local
        {
            int value = 50;
            void msg()
            {
                System.out.println(data+" "+value);
            }
        }
        Local l = new Local();
        l.msg();
    }
}
class Tester
{
    public static void main(String[] args)
    {
        LocalInnerClass lic = new LocalInnerClass();
        lic.disp();
    }
}