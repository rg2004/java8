import java.util.PriorityQueue;

/**
 * Created by rohit on 8/15/2017.
 */
public class PriorityQueueTest {


    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<String>(4);
        pq.add("s");
        pq.add("a");
        pq.add("j");
        pq.add("b");
        pq.add("n");
        pq.add("g");
        while(!pq.isEmpty())
        {
            System.out.println(pq.poll());
           // pq.remove();
        }

    }
}
