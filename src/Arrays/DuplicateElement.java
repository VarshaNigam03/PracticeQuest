package Arrays;

import java.util.*;

public class DuplicateElement {

    static void duplicateElement(int arr[]){
//        Set<Integer> set = new HashSet<>();
//        int count=0;
//        for(int i=0; i<arr.length; i++){
//            if(!set.contains(arr[i])) {
//                set.add(arr[i]);
//            }
//            else {
//                System.out.println(arr[i]);
//            }
//        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if (!map.containsKey(arr[i]))
                map.put(arr[i],1);

        else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String []args){
        int arr[]={1,3,5,2,6,3,4,8,6,8,1,1,8,5,1};
        int arr1[]={1,1,1,2,3,4,4,4,4,5,6,6};
        duplicateElement(arr1);

    }

}
