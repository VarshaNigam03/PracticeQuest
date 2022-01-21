package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {

    //stores key value pair and hence separated from collections interface
    //advantages of map : key-value: keys are unique
    //values of keys are overriden of same key
    //O(1) : put(), contains, containskey(), remove
    static void mapMethods(){
        Map<Object, Object> map = new HashMap<>();
        map.put(3,"varsha");
        map.put(20,"dinu");
        map.put(24,"maa");
        map.put(7,"papa");
        map.put(12,"omi");
//        System.out.println(map);
        if(!map.containsKey(7))
            map.put(7,"di");

        map.putIfAbsent(8,"jiju");
//        System.out.println(map);

        //iterate : entry class
        for(Map.Entry<Object,Object> e : map.entrySet()){
//            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
        }
//        for(Object key : map.keySet())
//            System.out.println(key);
//        for(Object values : map.values())
//            System.out.println(values);

        System.out.println(map.containsValue("varsha"));
        System.out.println(map.isEmpty());
        System.out.println(map);
    }

    //treemap puts the map under the binary search tree sorted keys(dictionary wise)
    //O(n)
    static void treeMap(){
        Map<Object,Object> map = new TreeMap<>();
        map.put(3,"varsha");
        map.put(20,"dinu");
        map.put(24,"maa");
        map.put(7,"papa");
        map.put(12,"omi");
        map.remove(12);
        System.out.println(map);
    }


    public static void main(String []args){
     //   mapMethods();
        treeMap();
    }
}
