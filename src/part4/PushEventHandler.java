package part4;

public class PushEventHandler implements QueueEventHandler<PushMessageEvent> {
    @Override
    public void handleEvent(PushMessageEvent pushMessageEvent) {
        System.out.println("Sending push notification: " + pushMessageEvent);
        // do stuff to send push notification
    }
}
