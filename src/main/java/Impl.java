import java.util.concurrent.atomic.AtomicInteger;

public class Impl implements Runnable {
    public int i = 0;
    AtomicInteger atomicInteger = new AtomicInteger();
    public void run()
    {
        i++;
        atomicInteger.addAndGet(1);
    }
}
