package Arrays;

import java.util.Arrays;

public class ReverseString {

    static void methodOne(String str){
     //   if(!str || str.length() <2 || typeOf(str)!="String"){return "Not applicable"};
        char str1;
        String nstr="";
        for(int i=0; i<(str.length()-1)/2; i++){
            str1= str.charAt(i);
            nstr=str1+nstr;
        }
        System.out.println(nstr);
    }

    static void methodTwo(String str){
        char ch[]=str.toCharArray();
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(ch[i]);
        }
    }

    static void methodThree(String str){
         StringBuilder str1 = new StringBuilder(str);
         str1.reverse();
         System.out.println(str1);
    }

    public static void main(String []args){
        methodOne("hello hello");
      //  methodTwo("hello");
    //    methodThree("varsha");
    }


}
