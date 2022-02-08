package Arrays;

import java.util.*;

// sliding window technique

public class MinimumJumpsToEnd {

    //using iteration
    //TC : O(n*K) SC : O(1)
    static void minJumps(int arr[], int k){
        int n=arr.length, max=0;
        for(int i=0; i<n-k; i++){
            max = arr[i];
            for(int j=1; j<k; j++){
                if(arr[i+j]>max)
                    max=arr[i+j];
            }
        }
        System.out.println(max+ " ");
    }

    //using avl tree
    //TC : O(nlogk) SC : O(k)
    static void minJumps1(int arr[], int k, int n){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        ArrayList<Integer> al = new ArrayList<>();
        int i=0;
        for(; i<k; i++){
            queue.add(arr[i]);
        }
        al.add(queue.peek());
        queue.remove(arr[0]);

        for(; i<n; i++){
            queue.add(arr[i]);
        }
        al.add(queue.peek());
        queue.remove(arr[i-k+1]);

        System.out.println(al);
    }

    //Using deque TC : O(n) SC : O(k)
    static void minJump2(int arr[], int k, int n){
        Deque<Integer> dq = new ArrayDeque<>();
        int i;
        for(i=0; i<k; i++){
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(; i<n; i++) {
            System.out.print(arr[dq.peek()] + " ");
            while((!dq.isEmpty()) && dq.peek() <= i-k){
                dq.removeFirst();
            }
            while((!dq.isEmpty()) && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.peek()]);
    }

    public static void main(String []args){
        int arr[]={4,1,3,5,1,2,3,2,1,1,5};
    //    minJumps(arr, 3);
        int n= arr.length;
      //  minJumps1(arr,3,n);
        minJump2(arr,3,n);
    }


}
