package Arrays;

public class Fibonacci {

    static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static void swap1(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }

    public static void main(String []args){
    //    System.out.println(fibonacci(7));
        swap1(2,3);
    }
}
