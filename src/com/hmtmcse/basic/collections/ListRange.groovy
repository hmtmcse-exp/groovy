package com.hmtmcse.basic.collections

/**
 * Created by Touhid Mia on 5/01/2015.
 */
class ListRange {

    public static void main(String[] args) {
        def numberRange = 1..10
        println("=========== Print Number Range ===========")
        //Print Number Range
        println(numberRange);

        println("=========== Print Number Range From ===========")
        println(numberRange.from);

        println("=========== Print Number Range To ===========")
        println(numberRange.to);

        def characterRange = 'a'..'z'
        println("=========== Print Character Range ===========")
        println(characterRange);
    }
}
