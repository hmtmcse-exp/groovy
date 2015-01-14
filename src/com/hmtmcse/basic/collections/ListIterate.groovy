package com.hmtmcse.basic.collections

/**
 * Created by Touhid Mia on 5/01/2015.
 */
class ListIterate {

    public static void main(String[] args) {
        def list = [5, 6, 7, 8]

        println("===== Iterate Technic-1 =====")
        //Iterate Technic-1
        list.collect {
            println(it)
        }

        println("===== Iterate Technic-2 =====")
        //Iterate Technic-2
        list.each {
            println(it)
        }


        println("===== Iterate Technic-3 =====")
        //Iterate Technic-3
        for(int i = 0; i < list.size(); i++){
            println(list[i])
        }

        println("===== Iterate Technic-4 =====")
        //Iterate Technic-4
        for ( value in list ) {
            println(value)
        }


        println("===== Iterate Technic-5 =====")
        //Iterate Technic-5
        list.eachWithIndex() { value, key -> println " ${key} : ${value}" };


        println("===== Iterate Technic-6 =====")
        //Iterate Technic-6
        (1..10).each {
            print(it)
        }
    }
}
