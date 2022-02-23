package Arrays;

import java.util.*;

public class MinimiseMaxHeight {

    static int minimiseMaxHeight(int arr[], int n , int k){
       Arrays.sort(arr);
       int ans = arr[n-1]- arr[0];
       int max= 0, min =0;
       for(int i=1; i<arr.length; i++){
           max= Math.max(arr[i-1]+k, arr[n-1]-k);
           min= Math.min(arr[i]-k, arr[0]+k);
           ans= Math.min(ans, max-min);
       }
       return ans;
    }

    public static void main(String []args){
        int arr[]={1, 5, 8, 10};
        System.out.println(minimiseMaxHeight(arr, arr.length, 2));
    }

}
