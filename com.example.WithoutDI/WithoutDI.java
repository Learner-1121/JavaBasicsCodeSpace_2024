class EmailService
{
    public void sendEmail(String message,String reciever)
    {
        //logic to send email
        System.out.println("Email sent to reciever = "+reciever+" with message = "+message);
    }
}
class MyApplication
{
    private EmailService email = new EmailService();
    public void processMessages(String msg,String rec)
    {
        // do some msg validation, and manipulation logic
        this.email.sendEmail(msg,rec);
    }

}
class MyLegacyTest
{
    public static void main(String[] args)
    {
        MyApplication myApp = new MyApplication();
        myApp.processMessages("Hi Yamini","ysksiddani@gmail.com");
    }
}