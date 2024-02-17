package com.ayan.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {
        String[] str= {"Hi", "my", "name", "is", "Ayan"};

//      of(array_name) :  this of method will convert an array to a list
        List<String> list= List.of(str);
        System.out.println(list);
//        [Hi, my, name, is, Ayan]
        System.out.println(list.getClass().getName());
//        java.util.ImmutableCollections$ListN

//      list.add("Mandal"); This will cause error, because it is an immutable collection
//        Exception in thread "main" java.lang.UnsupportedOperationException
//	            at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
//	            at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
//	            at com.ayan.list.arraylist.ArrayList3.main(ArrayList3.java:13)

//      To fix above issue
        ArrayList<String> myList= new ArrayList<>(list);
        myList.add("Mandal");
//        Like this we can add, because arraylist is mutable
        System.out.println(myList);
//        [Hi, my, name, is, Ayan, Mandal]

        ArrayList<String> newList= new ArrayList<>(List.of(new String[]{"Tamluk", "Haldia"}));
//      To add a list at last of another list
        myList.addAll(newList);
//      To add a collection at a specific position
        myList.addAll(0, newList);
        System.out.println(myList);


    }
}
