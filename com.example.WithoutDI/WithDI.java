


// Service Components - defines contract for the services
// Consumer classes
// Injector classes

interface MessageService
{
    public void sendMessage(String msg,String rec);
}
class EmailService implements MessageService
{
    @Override
    public void sendMessage(String msg,String rec)
    {
        System.out.println("Email sent to "+rec+" with message "+msg);
    }
}
class SMSService implements MessageService
{
    @Override
    public void sendMessage(String msg, String rec)
    {
        System.out.println("SMS sent to "+rec+" with message "+msg);
    }
}
interface Consumer{
    public void processMessages(String msg,String rec);
}
class MyDIApplication implements Consumer
{
    private MessageService service;
    MyDIApplication(MessageService service)
    {
        this.service = service;
    }
    public void processMessages(String msg,String rec)
    {
        this.service.sendMessage(msg,rec);
    }
}

interface MessageServiceInjector
{
    Consumer getConsumer();
}

class EmailServiceInjector implements MessageServiceInjector
{
    @Override
    public Consumer getConsumer()
    {
        return new MyDIApplication(new EmailService());
    }

}
class SMSServiceInjector implements MessageServiceInjector{
    @Override
    public Consumer getConsumer()
    {
        return new MyDIApplication(new SMSService());
    }
}
class MyMessageDITest
{
    public static void main(String[] args)
    {
        String msg = "Hi Yamini";
        String email = "ysksiddani@gmail.com";
        String phone = "9642547049";
        MessageServiceInjector injector = null;
        Consumer app = null;

        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg,email);

        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg,phone);
    }
}
