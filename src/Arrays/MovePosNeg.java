package Arrays;

public class MovePosNeg {

    static void movePosNeg(int arr[]) {
        int i=0, j=arr.length-1;
        while(i < j) {
            if (arr[i] > 0 && arr[j] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(arr[i] > 0 && arr[j] > 0 ){
                j--;
            }
            else if(arr[i] < 0 && arr[j] < 0){
                i++;
            }
            else {
                i++;
                j--;
            }
        }
        for(int k=0; k<arr.length; k++)
        System.out.print(arr[k]+" ");
        }

    public static void main(String []args){
        int arr[]={-12, 11, -13, -5, 6, -7, 5, -3, 11,-10,15,-9 };
        movePosNeg(arr);
    }



}
