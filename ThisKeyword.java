class Student
{
    int rollno;
    float fee;
    String name;
    Student(int rollno,String name,float fee)
    {
        /*
          - this can be used to refer current class instance variable
          - this keyword resolves the problem if there is ambiguity between
            instance variables and parameters
         */
        this.rollno = rollno;  
        this.fee = fee;  
        this.name = name;
        /*rollno = rollno;
        fee = fee;
        name = name;*/
    }
    void display(int rollno,String name,float fee)
    {
        // refers to parameters
        this.displayParams(rollno,name,fee); // invokes current class method
        // refers to instance variables of class
        System.out.println(this.rollno+" "+this.name+" "+this.fee); 
    }
    void displayParams(int rollno,String name,float fee)
    {
        System.out.println(rollno+" "+name+" "+fee);
    }
}
class TestThis
{
    public static void main(String[] args)
    {
        Student s1 = new Student(1,"Yamini",10000.0f);
        s1.display(1,"Asha",20000.0f);
    }
}