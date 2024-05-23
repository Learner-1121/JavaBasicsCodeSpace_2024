public class MemberInnerClass
{
    private int data = 20;
    class Member
    {
        void print()
        {
            System.out.println("data is "+data);
        }
    }
}
class Tester
{
    public static void main(String[] args)
    {
        MemberInnerClass mic = new MemberInnerClass();
        MemberInnerClass.Member m = mic.new Member();
        m.print();
    }
}