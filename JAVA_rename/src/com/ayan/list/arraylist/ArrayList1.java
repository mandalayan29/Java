package com.ayan.list.arraylist;

import java.util.ArrayList;

record Employee(int id, String name, String address){
    public Employee(String name){
        this(0, "NEW", "");
    }
}

public class ArrayList1 {

    public static void main(String[] args) {

        Object[] empArr1= new Object[3];
        empArr1[0]= new Employee("HI");
        empArr1[1]= new Employee(1, "Ayan", "Tamluk");
        empArr1[2]= "Hello";
//      the above line won't give any Syntax error as I didn't mention the specific object type
        for(Object obj: empArr1){
            System.out.println(obj.toString());
        }

//        Employee[id=0, name=NEW, address=]
//        Employee[id=1, name=Ayan, address=Tamluk]
//        Hello

//      To specify the type of the object
        Employee[] empArr2= new Employee[3];
        empArr2[0]= new Employee("HI");
        empArr2[1]= new Employee(1, "Ayan", "Tamluk");
//      empArr2[2]= "Hello";         Now this will cause error
        for(Object obj: empArr2){
            System.out.println(obj.toString());
        }
//        Employee[id=0, name=NEW, address=]
//        Employee[id=1, name=Ayan, address=Tamluk]
//        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.toString()" because "obj" is null
//        at com.ayan.list.arraylist.ArrayList1.main(ArrayList1.java:28)
//        No error, only null exception because I didnt assign the last array object

//      ======================= ArrayList ===========================
        ArrayList arr1= new ArrayList();
//      If we initialize array list like this, It will be a array of object
        arr1.add(new Employee("Ayan"));
        arr1.add(new Employee(1, "Ayan", "Tamluk"));
        arr1.add("Hi my name is ayan mandal");
        arr1.add(new int[]{1,2,3,4,5});
        for(Object obj: arr1){
            System.out.println(obj.toString());
        }
//        Employee[id=0, name=NEW, address=]
//        Employee[id=1, name=Ayan, address=Tamluk]
//        Hi my name is ayan mandal
//        [I@6ce253f1



//      Specifying the type of array list
//      ArrayList<Employee> this defines the arrayList is a list of employee type
//      new ArrayList<Employee>();  Recommendation: explicit type argument Employee can be replaced with <>
        ArrayList<Employee> empList= new ArrayList<Employee>();
        empList.add(new Employee("Ayan"));
        empList.add(new Employee(1, "Ayan  Mandal", "Tamluk"));
//      We can't add anything except Employee object, else it will cause error
        for(Object obj: empList){
            System.out.println(obj.toString());
        }





    }


}
