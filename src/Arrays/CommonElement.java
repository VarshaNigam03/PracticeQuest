package Arrays;

import java.util.HashSet;

public class CommonElement {

    static Object arr1[]={"a",3,"hello"};
    static Object arr2[]={"v",7,"hello"};
    //adding one array into hashset and matching other array from map---O(n)
    static void comEle(Object arr1[], Object arr2[]){
        int count=0;
        Object arr3[]={};
        HashSet<Object> map =new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            map.add(arr1[i]);
        }
        for(int i=0; i< arr2.length; i++){
            if(map.contains(arr2[i]))
                System.out.println((arr2[i]));
                count++;
        }

    }



    public static void main(String []args){
        comEle(arr1, arr2);
    }
}
