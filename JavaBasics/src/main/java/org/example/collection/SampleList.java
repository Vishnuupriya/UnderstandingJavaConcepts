package org.example.collection;

import java.sql.SQLOutput;
import java.util.*;

//List is an Interface ,
//ArrayList and LinkedList is Class
public class SampleList {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(); //one way to create list
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println(list); // op: [1,2,3,4]
//        System.out.println(list.contains(5)); //op : false it does not have an element called 5
////        for(int i:list){
////            System.out.println(i);
////        } //another type foreach method
//        list.forEach(System.out::println);


        //otherway to create list-> using Arrays class
        List<String> list2 = Arrays.asList("Priya","Vishnuu","Hello","Hi","I");
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(list2,comparator);
        list2.forEach(System.out::println);
        System.out.println("========================================================");
        //comparator using lambda function
        Comparator<String> comp = (i,j) -> i.length() < j.length() ?1:-1 ;

        Collections.sort(list2,comp); //this method Collections.sort() only works in List not in set.
        list2.forEach(System.out::println);



        //Linkedlist initiation
//        SampleList sampleList = new SampleList();
//        sampleList.main();
    }
}
class SampleLinkedList{
    public void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Priya");
        list.add("Lakshmi");
        list.add("Vishnuu");
        list.add("Sangeetha");
        list.add("Avi");
        list.add("Tara");
        System.out.println(list);
        System.out.println("==========================");
        list.forEach(System.out::println); //before sort
        System.out.println("==========================");
        list.sort(Comparator.naturalOrder());
        list.forEach(System.out::println); //after sort
        System.out.println("==========================");
        list.pop();
        list.forEach(System.out::println); //after pop
        System.out.println("==========================");

    }
}
