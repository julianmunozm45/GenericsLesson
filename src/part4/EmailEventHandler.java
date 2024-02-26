package part4;

public class EmailEventHandler implements QueueEventHandler<EmailMessageEvent> {
    @Override
    public void handleEvent(EmailMessageEvent emailMessageEvent) {
        System.out.println("Sending email: " + emailMessageEvent);
        // do stuff to send the email
    }
}
