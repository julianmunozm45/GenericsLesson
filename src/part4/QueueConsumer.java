package part4;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueConsumer {

    public <T> void consume(Queue<T> queue, QueueEventHandler<T> eventHandler) {
        T event = queue.remove();
        eventHandler.handleEvent(event);
    }

    public static void main(String[] args) {
        var email1 = new EmailMessageEvent("uuiie3", "pepitoperez@hotmail.com", "Behave boy!");
        var email2 = new EmailMessageEvent("derjj5", "zoro@twopiece.com", "Kanpai!");
        var email3 = new EmailMessageEvent("ziieh2", "carlitox@hotmail.com", "Todos los niños vuelan, y tu también carlitox");
        var emailQueue = new LinkedList<EmailMessageEvent>();
        emailQueue.offer(email1);
        emailQueue.offer(email2);
        emailQueue.offer(email3);

        var push1 = new PushMessageEvent("uiish7", 33812L, "Hooray :)", Vendor.APNS);
        var push2 = new PushMessageEvent("tkgjy6", 97818L, "Get some orange juice", Vendor.FCM);
        var push3 = new PushMessageEvent("ye13jf", 19817L, "Happy new year!", Vendor.PINPOINT);
        var push4 = new PushMessageEvent("fur3k3", 86811L, "Discounts at sanandresito :o", Vendor.APNS);
        var pushQueue = new LinkedList<PushMessageEvent>();

        pushQueue.offer(push1);
        pushQueue.offer(push2);
        pushQueue.offer(push3);
        pushQueue.offer(push4);

        var consumer = new QueueConsumer();

        System.out.printf("%n%n");
        System.out.println("Consuming emails");
        while (!emailQueue.isEmpty()) consumer.consume(emailQueue, new EmailEventHandler());
        System.out.printf("%n%n");
        System.out.println("Consuming push notifications");
        while (!pushQueue.isEmpty()) consumer.consume(pushQueue, new PushEventHandler());
    }
}
