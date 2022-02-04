package Arrays;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {

    static void union(int arr1[] ,int arr2[]){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++ ) {
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            if(!set.contains(arr2[i])){
                set.add(arr2[i]);
            }
        }
        System.out.println(set.size());
    }

    public static void main(String []args){
        int arr1[]= {85,25,1,32,54,6};
        int arr2[]= {85,2};
        union(arr1, arr2);
    }

}
