package org.example.collection;

import java.util.HashMap;
import java.util.Map;

//Map doesnt follow sequence order
public class SampleMap {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("priya",89) ;
        map.put("riya",59) ;
        map.put("shriya",39) ;
        //keys are unique no duplicate
        //values can have duplicate

        System.out.println(map.get("priya") );
        System.out.println(map.containsKey("riya") ); //true
        System.out.println(map.containsValue(49) );//false
        System.out.println(map.keySet() ); // [priya, shriya, riya]
        map.forEach((k,v)->{System.out.println(k+" : "+v);});
        System.out.println("=======================================================");
        map.replace("priya",89,99);
        map.forEach((k,v)->{System.out.println(k+" : "+v);});

    }
}
