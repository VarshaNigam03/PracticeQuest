package Arrays;

public class Sort012 {

    static void sort012(int arr[],int n){
        int count0=0, count1=0, count2=0;
        for(int i=0; i<n; i++){
           switch(arr[i]){
               case 0: count0++;
                   break;
               case 1: count1++;
                   break;
               case 2: count2++;
                   break;
           }
        }
        int i=0;
        while(count0 > 0){
            arr[i++]=0;
            count0--;
        }
        while(count1 > 0){
            arr[i++]=1;
            count1--;
        }
        while(count2 > 0){
            arr[i++]=2;
            count2--;
        }
        for(int j=0; j<n; j++)
        System.out.print(arr[j]+" ");
    }

    public static void main(String []args){
        int arr[]={0,1,0,2,2,2,2,1,1,1,0,0,0};
        int n=arr.length;
        sort012(arr,n);
    }
}
