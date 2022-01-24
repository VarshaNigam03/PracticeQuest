package Strings;

import java.util.Arrays;

public class StringLength {

    static void stringLength(String str){
        char ch[]=str.toCharArray();
        int length=0;
        for(char c : ch){
            length++;
        }
        System.out.println("length of string is :"+length);
    }

    //time complexity : O(n)
    static void changeCase(String str){
        char ch[]= str.toCharArray();
        String str1=null;
        for(int i=0; i<str.length(); i++){
            //converting to upper case
            if(ch[i]>=65 && ch[i]<=90){
            ch[i]+=32;
        }
            //converting to lower case
     //       else if(ch[i] >=97 && ch[i]<= 122)
            else if(ch[i] >= 'a' && ch[i]<= 'z'){
                ch[i]-=32;
            }
//           str1= Arrays.toString(ch);
             System.out.print(ch[i]);
        }
//        System.out.println(str1);
//        for(int i=0; i< ch.length; i++) {
//            System.out.print(ch[i]);
//        }
    }

    public static void main(String []args){
        String str="Hi How Are You";
       // stringLength(str);
        changeCase(str);
    }

}
