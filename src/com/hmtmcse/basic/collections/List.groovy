package com.hmtmcse.basic.collections

/**
 * Created by Touhid Mia on 5/01/2015.
 */
class List {

    public static void main(String[] args) {

        //List Declaration and initialization Technic-1
        def list = []
        list.add("Touhid");
        list.add("CSE");

        //List Declaration and initialization Technic-2
        def list1 = [5, 6, 7, 8]

        //List Declaration and initialization Technic-3
        def list2 = []
        list2 << [5, 6, 7, 8]

        //List Declaration and initialization Technic-3
        def list3 = []
        list3[0] = 5
        list3[1] = 6
        list3[2] = 7
        list3[3] = 8

        println("\n=========== Get Data From List Technic-1 ===========")
        //Get Data From List Technic-1
        println(list.get(0));
        println(list.get(1));

        println("\n=========== Get Data From List Technic-2 ===========")
        //Get Data From List Technic-2
        println(list1[0]);
        println(list1[1]);

        println("\n=========== Get Data From List Technic-3 ===========")
        //Get Data From List Technic-3
        println(list3);

    }
}
