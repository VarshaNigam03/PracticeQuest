package Arrays;


import java.util.Scanner;

//Kadane's Algorithm(V. imp.)
public class MaxSubArraySum {

    static Scanner sc = new Scanner(System.in);

    static void maxSum(int arr[]){
//        for(int k=0; k<arr.length; k++)
//            arr[k] =sc.nextInt();
        int maxSum= arr[0];
        int curSum= 0;
        for(int i=0; i< arr.length; i++){
            curSum=curSum + arr[i];
            if(curSum > maxSum)
                maxSum= curSum;
            if(curSum<0)
                curSum=0;
        }
        System.out.println(maxSum);;
    }

    public static void main(String []args){
        int arr2[]= new int[5];
        System.out.println("enter an array");
        for(int i=0; i<arr2.length; i++)
            arr2[i]=sc.nextInt();
        int arr[]={1,2,3,-2,5};
        int arr1[]={-3,-2,-1,-4};
        maxSum(arr2);
    }

}
