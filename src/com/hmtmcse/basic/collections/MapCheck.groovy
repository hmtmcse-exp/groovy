package com.hmtmcse.basic.collections

/**
 * Created by Touhid Mia on 5/01/2015.
 */
class MapCheck {

    public static void main(String[] args) {
        def map = [:]
        map.put("name", "Touhid");
        map.put("department", "CSE");

        if(map instanceof java.util.Map){
            println("Yes This is Map")
        }

        if(map.size() >= 0){
            println("Map is Not empty");
        }

    }
}
