package Collections;

public class InsertDeleteHeap {

    static void insertHeap(int arr[], int n) {
        int i = n;
        int temp = arr[n];
        while (i > 1 && temp > arr[i / 2]) {
            arr[i] = arr[i / 2];
            i = i / 2;
        }
        arr[i] = temp;//max heap
    }


    static int deleteHeap(int arr[], int n) {
        int i, j, x;
        int val=arr[1];
        x = arr[n];
        arr[1] = arr[n];
        arr[n]=val;
        i = 1;
        j = (i * 2) ; //right child
        while (j< n-1) {
            if (arr[j+1] > arr[j]) //j is child
                j = j+1;
            if (arr[i] < arr[j]) { //if child is greater than parent...swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i = j; //child
                j = (2 * j); //right child
            }
            else
                break;

        }
        return val;
    }

    public static void main(String []args){
        int arr[]={0,10,20,30,25,5,40,35};
        for(int i=2; i<arr.length; i++)
        insertHeap(arr, i);
        for(int i=7; i>=1; i--)
        System.out.println("deleted value :" + deleteHeap(arr,i));
//        for(int i=1; i<=7; i++)
//            System.out.println(arr[i]);

    }


}
