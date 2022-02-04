package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallest {

    static void kthLargest(int []arr,int k){
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());// largest kth number -- min heap
        for(int i=0; i< arr.length; i++){
            pq.add(arr[i]);
            if(pq.size()>k)
                pq.poll();
        }
//        System.out.println(pq);
        System.out.println(pq.peek());

    }

    public static void main(String []args){
        int arr[]={7,10,4,3,20,15};
        int k=3;
   //     int n=arr.length;
             kthLargest(arr,k);

    }

}
