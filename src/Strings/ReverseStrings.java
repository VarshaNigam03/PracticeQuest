package Strings;

public class ReverseStrings {

    static void reverseString(String str){
        char ch[]=str.toCharArray();
        for(int i=ch.length-1; i>=0; i--) {
            System.out.print(ch[i]);
        }
    }

    //with characters
    static boolean pallindromeString(String str) {
        char ch[] = str.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            if(ch[i]!=ch[j])
               return false;
            i++;
            j--;
        }
        return true;
    }

    //with words
    static boolean pallindromeWords(String str){
        String str1[]=str.split(" ");
        for(int i=0; i<str1.length; i++)
        if(!str1[i].equals(str1[str1.length-i-1]))
            return false;

            return true;
    }


    public static void main(String []args){
        String str = "Hi how are era woh iH";
        String str1= "Hi how are you";
        String str2= "hi how are u u are how hi";
      //  reverseString(str1);
//        if(pallindromeString(str)==true)
//            System.out.println("it's a pallindrome");
//        else
//            System.out.println("Not a pallindrome");
        if(!pallindromeWords(str1))
                System.out.println("not palindrome words");
        else
                System.out.println("palindrome words");
    }

}
