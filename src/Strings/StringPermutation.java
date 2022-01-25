package Strings;

public class StringPermutation {

    //time complexity : O(n*n!)
    //if u have duplicates in string dont want them to permute...use hashset.add(str), then same logic
    static void permute(String str, String permutes){
        String right="";
        String left="";
        for(int i=0; i<str.length(); i++){
            char  ch=str.charAt(i);
            left=str.substring(0,i) ;
            right=str.substring(i+1);
            String rest= left+right;
            permute(rest,permutes+ch);
        }
        if(left.length()==str.length())   //to get permutations(no if : substrings)
        System.out.println(permutes);
    }

    public static void main(String []args){
        String str= "abc";
        String ans="";
        permute(str,ans);

    }

}
