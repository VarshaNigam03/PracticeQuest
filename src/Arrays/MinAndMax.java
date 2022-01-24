package Arrays;

public class MinAndMax {

    //O(n)
    //max no. of comparisons : 2(n-1)    min no. of comparisons : (n-1)
    static void minAndMax(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min)
                min=arr[i];
           else if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("max: "+max+" min: "+min);
    }

    public static void main(String []args){
        int arr[]={3,2,8,10,4,7,-1,0,11};
        minAndMax(arr);
    }

}
