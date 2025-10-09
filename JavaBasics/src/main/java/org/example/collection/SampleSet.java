package org.example.collection;

import java.util.*;

//set does not follow sequence order
public class SampleSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Priya");
        set.add("Sangeetha");
        set.add("Avi");
        set.add("Tara");
        set.add("Chitra");
        set.add("Priya");//set does not allow duplicates , they are unique.
        System.out.println(set); //[aa, dd, a, d, bw] ->random order
        System.out.println(set.isEmpty());  // False
        System.out.println(set.size()); // 4
        System.out.println(set.contains("a")); //true

        set.forEach(System.out::println); //more enhanced for loop

        System.out.println("======================================");
        //sorting by length of string
        Comparator<String> comp = (i, j) -> i.length() < j.length() ?1:-1 ;
/*Collections.sort((List<String>) set,comp);
 this method Collections.sort() only works in List not in set.
 For Set, Convert set into list and then use .sort() method
 SET USES TREESET CLASS TO GET SORTED!!! NOT USING COMPARATOR   */
        // EXAMPLE
        List<String> list = new ArrayList<>(set);
        Collections.sort(list); // simple sort alphabetically
        list.forEach(System.out::println);
        System.out.println("==============================");
        list.sort(comp);
        list.forEach(System.out::println);

        System.out.println("==============================");
        //To sort automatically use TreeSet class
        Set<String> set2 = new TreeSet<>();
        set2.add("Rajith");
        set2.add("Gowtham");
        set2.add("Vijay");
        set2.add("Rakshan");
        set2.add("Ashwin");
        set2.add("Arjun");
        set2.add("Dhruv");
        System.out.println(set2);

        //set2.forEach(System.out::println);


    }
}
