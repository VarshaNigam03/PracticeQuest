package Arrays;



public class MergeArrays {

    static int arr1[]={1,3,5,6,8,9,11};
    static int arr2[]={0,2,4,7,10,15,18};

    static void mergeArrays(int arr1[], int arr2[]){
        int i=0;
        int j=0;
        int arr[]=new int[50];
        int k=0;
        int m= arr1.length;
        int n= arr2.length;
       while(i<m && j<n) {
           if(arr1[i]<arr2[j]) {
               arr[k] = arr1[i];
               k++;
               i++;
           }
           else
               arr[k++]=arr2[j++];
       }
       for(; i<m; i++){
           arr[k++]=arr1[i];
       }
        for(; j<n; j++){
            arr[k++]=arr2[j];
        }
       for(k=0; k<m+n; k++)
           System.out.print(arr[k]+ " ,");

    }
    public static void main(String []args){
        mergeArrays(arr1,arr2);
    }

}
