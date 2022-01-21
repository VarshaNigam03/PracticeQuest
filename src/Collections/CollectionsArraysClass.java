package Collections;

import java.util.*;

public class CollectionsArraysClass {

    //works on primitive arrays : int a, search sort arraylist insert
    static void arrayClass(){
        //works only wen array is sorted
        int []numbers= {1,2,3,4,5,6,7,8,9};
        int index= Arrays.binarySearch(numbers, 3);
        System.out.println(index);
        Arrays.sort(numbers); //quicksort

        //parallel sort : 8192 min ele

        Arrays.fill(numbers,12);
        for(int i : numbers)
        System.out.println(i);
    }

    static void collectionClass(){
//        List<Integer> st =new ArrayList<>();
        List<StudentsHS> st =new ArrayList<StudentsHS>();
//        st.add(7);
//        st.add(9);
//        st.add(3);
//        st.add(10);
//        st.add(5);
//        System.out.println("min element : "+ Collections.min(st));
//        System.out.println("max element : "+ Collections.max(st));
//        System.out.println("min element : "+ Collections.frequency(st,3));
//        Collections.sort(st,Comparator.reverseOrder());
//        System.out.println(st);
        st.add(new StudentsHS("Varsha" ,3));
        st.add(new StudentsHS("Dinu" ,9));
        st.add(new StudentsHS("Maa" ,11));
        st.add(new StudentsHS("Papa" ,8));
        st.add(new StudentsHS("Di" ,7));

        StudentsHS s1 = new StudentsHS("Varsha", 1);
        StudentsHS s2 = new StudentsHS("Dinu", 24);
     //   System.out.println(s1.compareTo(s2));
        Collections.sort(st);
  //      System.out.println(st);
        Collections.sort(st, new Comparator<StudentsHS>() {
            @Override
            public int compare(StudentsHS o1, StudentsHS o2) {
                return o1.name.compareTo(o2.name);
            }
        });
 //       System.out.println(st);
        Collections.sort(st,(o1,o2)-> o1.name.compareTo(o2.name));
        System.out.println(st);


    }

    public static void main(String[] args){
     //   arrayClass();
        collectionClass();
    }
}
