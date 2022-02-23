package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramStrings {

    //two strings that are made of same and equal characters
    static boolean anagramString(String str1, String str2){
        char ch1[]=str1.toCharArray();
        Arrays.sort(ch1);
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch2);
        for(int i=0; i<ch1.length; i++) {
            if (ch1[i]!=ch2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String []args){
        String str1="medical ssh eam o";
        String str2="decimal ash mose";
        if(!anagramString(str1, str2))
            System.out.println("Not anagram strings");
        else
            System.out.println("Anagram strings");
    }

}
