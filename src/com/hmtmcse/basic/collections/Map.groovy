package com.hmtmcse.basic.collections

/**
 * Created by Touhid Mia on 5/01/2015.
 */
class Map {

    public static void main(String[] args) {

        //Map Declaration and initialization Technic-1
        def map = [:]
        map.put("name", "Touhid");
        map.put("department", "CSE");

        //Map Declaration and initialization Technic-2
        def map1 = [name:"Mia",department:"CSE"]

        //Map Declaration and initialization Technic-3
        def map2 = [:]
        map2 << [name:"Vai",department:"CSE"]

        println("\n=========== Get Data From Map Technic-1 ===========")
        //Get Data From Map Technic-1
        println(map.get("name"));
        println(map.get("department"));

        println("\n=========== Get Data From Map Technic-2 ===========")
        //Get Data From Map Technic-2
        println(map1["name"]);
        println(map1["department"]);

        println("\n=========== Get Data From Map Technic-3 ===========")
        //Get Data From Map Technic-3
        println(map2.name);
        println(map2.department);



        def myMap = [
                "touhid":[
                        "name":"Touhid",
                        "intake":"11th"
                ],
                "mia":[
                        "name":"Mia",
                        "intake":"11th"
                ],
        ]

        println("\n=========== Nested Map Each ===========")
        //Get Data From Map Technic-3

        myMap.values().each{
           println(it.name)
        }
        println(myMap["touhid"])
    }
}
