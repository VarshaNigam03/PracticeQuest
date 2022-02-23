package Arrays;

import java.util.ArrayList;

import static java.lang.Math.max;

//hackerrank

public class MinJumpsCount {

    static int minJumps(int arr[]){
        int maxR = arr[0];
        int step = arr[0];
        int jump = 1;
        int n = arr.length;
        if(arr[0]==0) return -1;
        else if (n-1==1) return 0;
        else{
            for(int i=1; i<n; i++){
                maxR=max(maxR, i+arr[i]);
                step--;
                if(step==0) {
                    jump++;
                    if(i>=maxR){
                        return -1;
                    }
                    step= maxR-1;
                }
            }
        }
        return jump;
    }

    static int duplicates(int arr[], int n){
       ArrayList<Integer> al = new ArrayList<>();
       for(int i=0; i<n; i++){
           int index = arr[i]%n;
           arr[index] += n;
       }
       for(int i=0; i<n; i++){
           if((arr[i]/n) >=2)
         //      al.add(i);
              return i;
       }
       return -1;
    }

    public static void main(String []args){
    //    int arr[]={1,3,5,8,9,2,6,7,6,8,9};
        int arr1[]={4,1,3,5,3,4};
     //   System.out.println(minJumps(arr)) ;
    //    System.out.println(duplicates(arr1, arr1.length));
        int i= duplicates(arr1, arr1.length);
        if(i==-1)
            System.out.print("-1");
        else
            System.out.print(i+" ");
    }

}
