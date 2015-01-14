package com.hmtmcse.basic.collections

/**
 * Created by Touhid Mia on 5/01/2015.
 */
class MapIterate {

    public static void main(String[] args) {
        def countries  = [
                [code:"BD",name:"Bangladesh"],
                [code:"AU",name:"Australia"],
                [code:"US",name:"United States"],
                [code:"IN",name:"India"],
                [code:"IQ",name:"Iraq"],
                [code:"JP",name:"Japan"],
                [code:"PK",name:"Pakistan"],
                [code:"QA",name:"Qatar"],
                [code:"RU",name:"Russia"],
                [code:"NP",name:"Nepal"],
        ]

        println("===== Iterate Technic-1 =====")
        //Iterate Technic-1
        countries.collect {
            println("Code = " + it.code + " Name = " + it.name)
        }

        println("===== Iterate Technic-2 =====")
        //Iterate Technic-2
        countries.each {
            println("Code = " + it.code + " Name = " + it.name)
        }


        println("===== Iterate Technic-3 =====")
        //Iterate Technic-3
        for(int i = 0; i < countries.size(); i++){
            println("Code = " + countries[i].code + " Name = " + countries[i].name)
        }

        println("===== Iterate Technic-4 =====")
        //Iterate Technic-4
        for ( keyValue in countries ) {
            println("Code = " + keyValue.code + " Name = " + keyValue.name)
        }


        println("===== Iterate Technic-5 =====")
        //Iterate Technic-5
        countries.eachWithIndex() { obj, i -> println " ${i}: ${obj}" };

    }
}
