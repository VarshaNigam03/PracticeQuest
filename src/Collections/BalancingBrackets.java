package Collections;

import java.util.Stack;

public class BalancingBrackets {
//()[{}]
    static boolean isBracketsMatching(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(isOpening(ch)) {
                st.push(ch);
            }
            else {
                if(st.isEmpty())
                    return false;
                else if(!isMatching(st.peek(), ch))
                    return false;
                else
                    st.pop();
            }

        }
        return st.isEmpty();
    }
    static boolean isOpening(char c){
         return  c== '{'  ||
                 c=='[' ||
                 c=='(';
    }

    static boolean isMatching(char a, char b){
        return (a=='{' && b=='}') ||
                (a=='(' && b==')') ||
                (a=='[' && b==']') ;
    }
    public static void main(String []args){
        String str= "{}[()}]";
       if(isBracketsMatching(str)==true)
           System.out.println("Balanced");
       else
           System.out.println("Not Balanced");

    }

}
