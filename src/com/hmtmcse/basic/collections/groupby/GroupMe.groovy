package com.hmtmcse.basic.collections.groupby

/**
 * Created by touhid on 24/02/2015.
 */
class GroupMe {

    public static void main(String[] args) {
        def users = [
                new User(name:'mrhaki', city:'Tilburg', birthDate:new Date(73,9,7)),
                new User(name:'bob', city:'New York', birthDate:new Date(63,3,30)),
                new User(name:'britt', city:'Amsterdam', birthDate:new Date(80,5,12)),
                new User(name:'kim', city:'Amsterdam', birthDate:new Date(83,3,30)),
                new User(name:'liam', city:'Tilburg', birthDate:new Date(109,3,6))
        ]


        def userToString = { it.toString() }

        def usersByCity = users.groupBy({ user -> user.city })


        def map = [
                [name: "A", roll:1],
                [name: "A", roll:1],
                [name: "A", roll:4],

                [name: "B", roll:10],
                [name: "B", roll:20],

                [name: "C", roll:2330],
                [name: "D", roll:10],

        ]



        def list = []
        int index = 0;
        list.add("")
        map.each {item->
            if (list.get(index) == item.name){
                print(item.roll)
            }else{
                println()
                list.add(index,item.name)
                println(item.name)
                println("===================")
                print(item.roll)
            }


        }



    }
}
