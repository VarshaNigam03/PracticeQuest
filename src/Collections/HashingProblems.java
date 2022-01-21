package Collections;

import java.util.HashSet;
import java.util.Set;
//union of two arrays
public class HashingProblems {

    static void distinctElements(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }

    static void intersection(int arr[], int arr1[]){
        Set<Integer> set = new HashSet<>();
        int count=0;
        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }
        for(int i=0; i<arr1.length; i++){
            if(set.contains(arr1[i])){
                count++;
              set.remove(arr1[i]);
            }
        }
        System.out.println(count);
    }

    public static void main(String []args){
        int arr[]={2,5,4,2,5,6,4,3};
        int arr1[]={2,7,8,5,2,6,4,3};
    //    distinctElements(arr);
        intersection(arr,arr1);

    }

}
