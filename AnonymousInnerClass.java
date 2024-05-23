abstract class Person
{
    abstract void eat();
}
interface Eatable
{
    void isEatable();
}
class AnonymousInnerClass
{
    public static void main(String[] args)
    {
        Person p = new Person()
        {
            @Override
            void eat()
            {
                System.out.println("Person is eating");
            }
        };
        p.eat();

        Eatable e =  new Eatable()
        {
            @Override
            public void isEatable()
            {
                System.out.println("You can eat these fruits ...");
            }
        };
        e.isEatable();
    }
}