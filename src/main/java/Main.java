import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executors = Executors.newFixedThreadPool(5);
        Impl impl = new Impl();

        for (int j = 0 ; j < 10; j++) {

            for (int i = 0; i < 10000; i++) {
                executors.submit(impl);
            }
            //try without sleep
            Thread.sleep(1000);
            System.out.println("normal integer: "+impl.i);
            System.out.println("Atomic: "+impl.atomicInteger);
            // starting fresh
            impl.atomicInteger.set(0);
            impl.i = 0;
        }
    }
}
