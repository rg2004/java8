import jdk.nashorn.internal.ir.Block;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by rohit on 8/9/2017.
 */
public class ProducerConsumer {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(2);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();


    }
}

class Producer implements Runnable{

    BlockingQueue<Integer> queue;

    Producer(BlockingQueue<Integer> queue)
    {
        this.queue = queue;
    }

    @Override
    public void run() {

        try {
            System.out.println(" putting 10");
            queue.put(10);
            System.out.println(" putting 21");
            queue.put(21);
            System.out.println(" putting 12");
            queue.put(22);
        }catch(InterruptedException e)
        {

        }


    }
}
class Consumer implements Runnable{

    BlockingQueue<Integer> queue;

    Consumer(BlockingQueue<Integer> queue)
    {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            int element = queue.take();
            System.out.println("elemet taken is:"+element);
        }catch(InterruptedException e)
        {

        }


    }
}
