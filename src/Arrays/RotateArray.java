package Arrays;

public class RotateArray {

    static void rotateArray(int arr[], int n){
        int k=5;
        int mod= k%n; //no. of rotation
       for(int i=0; i<n; i++) {
           System.out.print(arr[(i+mod)%n]+" ");
       }
    }

    static void rotateTwo(int arr[]){
        int last=arr[arr.length-1];;
        for(int i=arr.length-1; i>0 ; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        for(int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
        }

    static void rotateThree(int arr[]){
        int last=arr[arr.length-1];;
        for(int i=arr.length-2; i>=0 ; i--){
            arr[i+1]=arr[i];
        }
        arr[0]=last;
        for(int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String []args){
        int arr[]={1,2,3,-2,5};
        int n=arr.length;
    //    rotateArray(arr,n);
    //    rotateTwo(arr);
    //    rotateThree(arr);
    }

}
