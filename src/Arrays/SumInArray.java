package Arrays;

import java.util.HashSet;

public class SumInArray {

    //we'll match elements of hashset add compliments of nos. of array to hashset
    static int arr[]={1,4,7,3,8,2};
    static int sum= 16;

    static boolean checkSum(int arr[], int sum){
        HashSet<Integer> map = new HashSet<>();
       for(int i=0; i<arr.length; i++) {
           if(map.contains(arr[i])!=map.contains(arr[arr.length-1]))
               return true;
           map.add(sum-arr[i]);
        }
       return false;
    }

//    for(i=0; i<arr.length-1; i++){
//        for(j=i+1; j<arr.length; j++){
//            if(arr[i]+arr[j]==sum)
//                sop(arr[i]+arr[j]+sum);
//        }
//  }

    public static void main(String[] args){
         if(checkSum(arr,sum)==true)
             System.out.println("true");
    }
}
