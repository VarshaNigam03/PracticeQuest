package Collections;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueInterface {

    //FIFO
    //can be implemented by al, ll, and priority q
    //offer() always adds element at the last of queue
    static void queueMethods(){
        Queue<Object> qe= new LinkedList<>();
        qe.offer("hi");
        qe.offer("how");
        qe.offer("are");
        qe.offer("u");
        qe.offer(1);
        System.out.println(qe);
        System.out.println(qe.peek());
        System.out.println(qe.poll());
        System.out.println(qe.peek());
        //element() is similar to peek() : returns head element of queue.exception if queue is empty ....remove() is similar to poll()
        //add() is similar to offer(): inserts element. if task is successfull,returns true, if not, throws exception
    }

    //pq implements min heap by default
    //min heap: smaller number gets priority
    //stores same type of elements
    //Comparator.reverseOrder doesn't work for String
    //insertion, deletion O(logn)
    static void priorityQueue1(){
        Queue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
//        pq.offer("USA");
//        pq.offer("UK");
//        pq.offer("london");
//        pq.offer("agra");
        pq.offer(33);
        pq.offer(20);
        pq.offer(24);
        pq.offer(11);
        pq.offer(7);
        System.out.println(pq);
        System.out.println(pq.poll());  //removes the elements with min size and max priority (desc order)
        System.out.println(pq);
        System.out.println(pq.peek());
    }

    //doubly ended queue : can peek, offer or poll elements from either side
    //all methods of queue are available including more
    static void dequeMethods(){
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(33);
        ad.offer(20);
        ad.offer(24);
        ad.offer(11);
        ad.offer(7);
        ad.offerFirst(29);
        ad.offerLast(25);
        ad.offer(4);
        System.out.println(ad);
        System.out.println(ad.peekLast());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peek());
        System.out.println(ad.poll());
        System.out.println(ad.pollLast());
        System.out.println(ad.pollFirst());
        System.out.println(ad);
    }


    public static void main(String []args){
       // queueMethods();
  //      priorityQueue1();
        dequeMethods();
    }
}
