import java.util.PriorityQueue;

public class queueDemo01 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Adding Element

        pq.add(10);
        pq.add(20);
        pq.add(40);
        pq.add(12);
        pq.offer(20);

        System.out.println(pq); // Insertion Order preserved

        // get Head Element elemet() , peek()
        System.out.println(pq.peek());
        System.out.println(pq.element());
        System.out.println(pq);

        // Rreturn and remove element from the queue
        /// remove () , poll()
        System.out.println(pq.remove());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        // System.out.println( pq.remove());
        // System.out.println( pq.remove());
        // System.out.println(pq.remove());
        // System.out.println(pq.remove());
        // System.out.println(pq);
        /*
         * System.out.println(pq.poll());
         * System.out.println(pq.poll()); //null
         * System.out.println(pq.poll()); //null
         * System.out.println(pq.remove()); // Nosuch Element Exception
         */

    }
}
