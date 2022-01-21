package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

    //No duplicate elements are allowed
    //order of elements is not defined (like a bag) because of hashing
    //clear(), contains(), add() O(1)
    static void hashSet(){
        Set<Object> hs = new HashSet<>();
        hs.add(5);
        hs.add(3);
        hs.add(8);
        hs.add(10);
        hs.add(6);
        hs.add(4);
        hs.add(20);
        hs.add("varsha");
        System.out.println(hs);
        hs.remove(10);
        System.out.println(hs);
        System.out.println(hs.contains(10));
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        hs.clear();
        System.out.println(hs);
    }

    //ordered
    static void likedHahSet(){
        Set<Object> hs= new LinkedHashSet<>();
        hs.add(5);
        hs.add(3);
        hs.add(8);
        hs.add(10);
        hs.add(6);
        hs.add(4);
        hs.add(20);
        System.out.println(hs);
        hs.remove(10);
        System.out.println(hs);
        System.out.println(hs.contains(20));
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
//        hs.clear();
//        System.out.println(hs);
        }

        //sorted order, bin search tree and set
        //methods are implemented in O(log n)
        static void treeSet(){
        Set<Object> hs = new TreeSet<>();
            hs.add(5);
            hs.add(3);
            hs.add(8);
            hs.add(10);
            hs.add(6);
            hs.add(4);
            hs.add(20);
//            hs.add("varsha");
            System.out.println(hs);
            hs.remove(10);
            System.out.println(hs);
            System.out.println(hs.contains(20));
            System.out.println(hs.isEmpty());
            System.out.println(hs.size());

        }

    public static void main(String []args){
       // hashSet();
     //   likedHahSet();
     //   treeSet();
        Set<StudentsHS> set =new HashSet<>();
        set.add(new StudentsHS("Varsha",3));
        set.add(new StudentsHS("Dinu",20));
        set.add(new StudentsHS("Maa",24)); //hashset cannot diff between same rollNo or name as we are creating new object for students
        set.add(new StudentsHS("Papa",7));
        set.add(new StudentsHS("Di",27));
        set.add(new StudentsHS("Omi",12));
        System.out.println(set);
    }

}
