import java.util.HashSet;

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

    static int minPositiveMissing(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++)
            set.add(arr[i]);

        for(int i=1; i<10000; i++ ){
             if(!set.contains(i))
                 return i;
        }
          return 0;
    }

    public static void main(String []args){
        int arr[]= {1,2,4,5,6,9,10};
        int arr1[]={-1,-3,1,2,5,6,7,1,-3,5};
      //  missingElement(arr);
        int miss=minPositiveMissing(arr1);
        System.out.println(miss);

    }

}
