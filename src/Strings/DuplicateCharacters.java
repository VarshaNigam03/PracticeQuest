package Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

    //convert String into char array and apply same method logic on char array
    static void duplicateCharacters(String str){
        char ch[]=str.toCharArray();
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0; i< ch.length; i++){
            if(!map.containsKey(ch[i]))
                map.put(ch[i],1);
            else
            map.put(ch[i],map.get(ch[i])+1);
        }
        System.out.println(map);
    }

    public static void main(String []args){
        String str= "my name is varsha nigam";
        duplicateCharacters(str);
    }
}
