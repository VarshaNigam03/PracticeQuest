public class InsertElement {

    //rather use arralist to do this operation
    static int insertElement(int []arr,int num){
        int i;
        for(i=arr.length-1; (i>=0 && arr[i]>num); i--) {
                arr[i]=arr[i-1];
         }
        arr[i+1]=num;

        for(int k=0; k< arr.length; k++)
            System.out.println(arr[k]);
        return arr.length;
    }
    static void insertionSort(int []arr){

        for(int i=1; i<arr.length; i++){
           int j=i-1;
           int x=arr[i];
           while(j>-1 && arr[j]>x){
               arr[j+1]=arr[j];
               j--;
           }
            arr[j+1]=x;
        }
        for(int k=0; k<arr.length; k++)
            System.out.println(arr[k]);
    }


    public static void main(String []args){
        //int arr[]={2,4,5,9,11,23};
//        insertElement(arr, 6);
        int arr1[]={3,6,1,2,0,4,7};
        insertionSort(arr1);
    }

}
