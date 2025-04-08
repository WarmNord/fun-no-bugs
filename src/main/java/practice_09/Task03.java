package practice_09;

import java.util.concurrent.atomic.AtomicInteger;

public class Task03 {
    /*3. Задача: использование volatile
Условие задачи: Создайте поток, который бесконечно увеличивает счетчик. В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.*/
    static volatile boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger();

       Thread t = new Thread(
               () -> {
                   while (!stop) {
                       counter.getAndIncrement();
                       System.out.println(counter.get());
                   }
               }
       );

       t.start();
       Thread.sleep(2000);
       stop = true;
    }
}
