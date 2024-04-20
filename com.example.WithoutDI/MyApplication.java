public class MyApplication
{
    private EmailService email = new EmailService();
    public void processMessages(String msg,String rec)
    {
        // do some msg validation, and manipulation logic
        this.email.sendEmail(msg,rec);
    }

}