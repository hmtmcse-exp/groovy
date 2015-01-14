package com.hmtmcse.basic.collections

/**
 * Created by Touhid Mia on 5/01/2015.
 */
class ListCheck {

    public static void main(String[] args) {
        def list = []
        list.add("Touhid");
        list.add("CSE");

        if(list instanceof java.util.List){
            println("Yes This is List")
        }

        if(list.size() >= 0){
            println("List is Not empty");
        }

        if(list.contains('Touhid')){
            println("Yes Touhid Have in List");
        }
    }
}
