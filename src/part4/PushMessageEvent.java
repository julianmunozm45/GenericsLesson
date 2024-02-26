package part4;

public record PushMessageEvent(String messageId, long userId, String message, Vendor vendor) {
}
