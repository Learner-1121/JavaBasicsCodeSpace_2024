class Student{
    int rollno;
    String name;
    float fee;
    int classno;
    Student(int rollno,String name,int classno)
    {
        this.rollno = rollno;
        this.name = name;
        this.classno = classno;
    }
    Student(int rollno,String name,int classno,float fee)
    {
        this(rollno,name,classno);
        this.fee = fee;
    }
    public String toString()
    {
        if(fee==0.0f)
            return rollno+" "+name+" "+classno;
        else
            return rollno+" "+name+" "+classno+" "+fee;
    }
}
class TestThisConstructor
{
    public static void main(String[] args)
    {
        Student s1 = new Student(1,"Yamini",12,10000.0f);
        Student s2 = new Student(2,"Asha",11);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}