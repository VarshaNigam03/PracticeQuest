package Arrays;

public class SelectionQuickSort {

    static void selectionSort(int []arr){
        for(int i=0; i<arr.length-1; i++){
            int j,k;
            for(j=k=i; j<arr.length; j++){
                if(arr[j]<arr[k])
                k=j;
            }
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
        }
        for(int a=0; a<arr.length; a++)
        System.out.println(arr[a]);
    }

    public static void main(String []args){
        int arr[]={9,3,6,1,7,4};
        selectionSort(arr);
    }

}
