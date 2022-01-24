package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class CheckSort {

    static int arr2[]={3,7,9,10};


    // for array with only positive integers
    static int checkSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1])
                return -1;
        }
        return 1;
    }

    // for array with +ve and -ve integers (Bubble sort)
    static void bubbleSort(int arr[]) {
        int temp=0;
          for(int i=0; i<arr.length-1; i++){
              for(int j=0; j< arr.length-1-i; j++){
                  if(arr[j]>arr[j+1]) {
                      temp = arr[j];
                      arr[j] = arr[j + 1];
                      arr[j + 1] = temp;
                  }
              }

          }

    }
    public static void main(String []args){
//        int i=  checkSort(arr);
//        System.out.println(i);
        int arr1[]={-4,3,6,-2,-5,1,9};
        bubbleSort(arr1);
        for(int k=0; k<arr1.length; k++) {
            System.out.println(arr1[k]);
        }


    }

}
