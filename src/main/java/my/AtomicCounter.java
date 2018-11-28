package my;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

    private AtomicInteger num = new AtomicInteger(0);

    int getAndIncrement() {
        int curr, next;
        do {
            curr = num.get();
            next = curr + 1;
        } while (!num.compareAndSet(curr, next));
        return next;
    }
}
