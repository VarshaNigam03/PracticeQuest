//improved linear search
//1. wen we find the element we were looking for...either we transposition(i--) or move to front/head(i=0)

public class ArraySearch {

    static int arr[]={1,3,5,7,8,10,15};

    static int linearSearch(int find){
        for(int i=0; i<arr.length; i++){
            if(find==arr[i])
                return i;
        }
        return -1;
    }
    //array needs to be sorted
    //recursive binSearch calls func again in else if and else part(tail recursion(stack))
    static int binarySearch(int find){
        int l=0;
        int h=arr.length-1;


        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==find)
                return mid;
            else if(arr[mid]<find)
                l=mid+1;
            else if(arr[mid]>find)
                h=mid-1;
        }
        return -1;
    }

    public static void main(String []args){
//       int i= linearSearch(0);
//       System.out.println(i);
        int i=binarySearch(7);
        System.out.println(i);
    }
}
