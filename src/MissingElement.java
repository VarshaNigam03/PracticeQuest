import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MissingElement {

    static void missingElement(int arr[]){
        int diff=arr[0]-0;
        int miss=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]-i!=diff){
                while(diff<arr[i]-i){
                    miss=diff+i;
                    System.out.println(miss);
                    diff++;
                }
            }
        }
    }

    //treeset[O(nlogn)] is used to get sorted set, we can use hashset[O(n)] for random arrangement(arr1)
    static void minPositiveMissing(int arr[]){
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<arr.length; i++)
            set.add(arr[i]);

        //i should start from lowest value in array and end at highest
        for(int i=1; i< 10; i++ ){
             if(!set.contains(i))
                // return i;
                 System.out.println(i);
        }
      //   return 0;
    }

    public static void main(String []args){
        int arr[]= {1,2,4,5,6,9,10};
        int arr1[]={-1,-3,5,6,7,-3,5};
//        missingElement(arr);
        minPositiveMissing(arr);


    }

}
