package Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ListInterface {

    //ArrayList : its like array with dynamic data size
    //default capacity is 10 which increase with n+ n/2 +1
    //elements are always added at the end of the list
    // remove O(n), insertO(n), set O(1), contains O(n)
    //methods for ll and al are similar
    static void arrayList(){
        ArrayList<Object> al= new ArrayList<>();
        List<Object> al1= new ArrayList<>();
        al.add("varsha");
        al.add(1);
        al.add(1,"dinu");
        System.out.println(al);
        al1.add("maa");
        al1.add("papa");
        System.out.println(al1);
        al.addAll(al1);
        System.out.println(al);
        System.out.println(al.get(3));
        al.remove(2);
        System.out.println(al);
        al.remove(String.valueOf("varsha"));
        //  al.clear();
        al.set(0,"di");
        System.out.println(al.contains("papa"));
        System.out.println(al);

        //traverse
//        for(int i=0; i<al.size(); i++){
//            System.out.println(al.get(i));
//        }
//        for(Object ele: al){
//            System.out.println("for each " + ele);
//        }

        Iterator<Object> it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    //LIFO
    static void stackmethods(){
       Stack<Object> st =new Stack<>();
       st.push("tiger");
       st.push("lion");
       st.push(3);
       st.push(10);
       st.push("leopard");
        System.out.println(st);
        st.pop();
        System.out.println(st.peek()); //element on the top

    }

    public static void main(String []args){
    //    arrayList();
          stackmethods();
    }

}
