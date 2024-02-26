package part4;

public interface QueueEventHandler<T> {
    void handleEvent(T t);
}
