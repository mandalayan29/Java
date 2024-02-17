package com.ayan.list.arraylist;

import com.ayan.list.arraylist.Employee;

import java.util.ArrayList;

public class ArrayList2 {
    public static void printArrayList(ArrayList<Employee> list){
        System.out.println("=".repeat(30));
        for(Employee e: list){
            System.out.println(e.toString());
        }
        System.out.println("=".repeat(30));
    }

    public static void main(String[] args) {

        ArrayList<Employee> employeeList= new ArrayList<>();

        employeeList.add(new Employee(1, "Ayan", "Tamluk"));
        employeeList.add(new Employee(2, "Mandal", "Haldia"));
        employeeList.add(new Employee(3, "Myan", "Tamluk"));
        employeeList.add(new Employee(4, "Aandal", "Haldia"));
        System.out.println(employeeList);
//      [Employee[id=1, name=Ayan, address=Tamluk], Employee[id=2, name=Mandal, address=Haldia], Employee[id=3, name=Myan, address=Tamluk], Employee[id=4, name=Aandal, address=Haldia]]
        printArrayList(employeeList);
//        ==============================
//        Employee[id=1, name=Ayan, address=Tamluk]
//        Employee[id=2, name=Mandal, address=Haldia]
//        Employee[id=3, name=Myan, address=Tamluk]
//        Employee[id=4, name=Aandal, address=Haldia]
//        ==============================

//      To add an object at a defined index
        employeeList.add(2, new Employee(0, "New", "Added in index no : 2"));
//      To change object
        employeeList.set(3, new Employee(33, "Replaced", "This is a replaced list item"));
        printArrayList(employeeList);
//        ==============================
//        Employee[id=1, name=Ayan, address=Tamluk]
//        Employee[id=2, name=Mandal, address=Haldia]
//        Employee[id=0, name=New, address=Added in index no : 2]
//        Employee[id=33, name=Replaced, address=This is a replaced list item]
//        Employee[id=4, name=Aandal, address=Haldia]
//        ==============================

//      To remove a list item list_name.remove(Index_No)
        employeeList.remove(3);
        printArrayList(employeeList);
//      To remove all list item
//        employeeList.removeAll(employeeList);
//        printArrayList(employeeList);

//      To delete a specific list of item
        ArrayList<Employee> del= new ArrayList<>();
        del.add(new Employee(1, "Ayan", "Tamluk"));
        del.add(new Employee(2, "Mandal", "Haldia"));
        employeeList.removeAll(del);
        printArrayList(employeeList);

//        ==============================
//        Employee[id=0, name=New, address=Added in index no : 2]
//        Employee[id=4, name=Aandal, address=Haldia]
//        ==============================
//        Two items are deleted
    }

}
