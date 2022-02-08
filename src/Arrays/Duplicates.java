package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Duplicates {

    //TC : O(n) SC : O(1)
    //without using map
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0; i<n ;i++){
            int index = arr[i]%n;
            arr[index] +=n;
        }
        for(int i=0; i<n; i++){
            if(arr[i]/n >=2) {
                al.add(i);
            }
        }
        if(al.isEmpty())
            al.add(-1);
            return al;
    }

    //TC : O(n) SC : O(n)
    //using map
    static void duplaictes1(int arr[], int n){
        Map<Integer, Integer> map= new HashMap<>();
        boolean dup=false;
        for(int i=0; i<n; i++){
            if(!map.containsKey(arr[i]))
                 map.put(arr[i],1);
            else
                map.put(arr[i], map.get(arr[i])+1) ;
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()>1)
                System.out.print(e.getKey()+ " ");
                dup=true;
        }
        if(dup)
            System.out.println("-1");
    }

    public static void main(String []args){
        int arr[]={0,1,3,2};
        int arr1[]={0,2,2,4,4,5};
//        System.out.println(duplicates(arr,arr.length));
//        System.out.println(duplicates(arr1, arr1.length));
        duplaictes1(arr, arr.length);
        duplaictes1(arr1, arr1.length);
    }

}


