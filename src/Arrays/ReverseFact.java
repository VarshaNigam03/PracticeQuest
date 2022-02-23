package Arrays;

public class ReverseFact {

    static boolean reverseFact(int num) {
        int fact = 1;
        if (num <= 2) {
            System.out.println("true");
        } else {
            for (int i = 1; i <= num / 2; i++) {

                fact *= i;
                if (fact > num)
                    break;
                if (fact == num)
                    return true;
            }
        }
            return false;
        }


    public static void main(String args[]){
       if(reverseFact(7)==true)
           System.out.println("True");
       else
           System.out.println("False");
    }

}
