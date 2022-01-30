package Arrays;


import java.util.Arrays;

//We need to merge two arrays without using any extra space or using third array
public class MergeArray {

    static int arr1[] = new int[]{ 1, 5, 9, 10, 15, 20 };
    static int arr2[] = new int[]{ 2, 3, 8, 13 };

    static void merge(int n, int m) {
        int i=0;
        while(arr1[n-1]>arr2[0]){
            if(arr1[i]>arr2[0]){
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
                Arrays.sort(arr2);
            }
            i++;
        }
    }

    public static void main(String []args){
        merge(arr1.length,arr2.length);
        for(int i=0; i<arr1.length; i++)
            System.out.print(arr1[i]+" ");
        System.out.println();
        for(int i=0; i<arr2.length; i++)
            System.out.print(arr2[i]+" ");
    }
}
