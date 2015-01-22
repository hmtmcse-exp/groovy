package com.hmtmcse.basic.collections;

/**
 * Created by touhid on 19/01/2015.
 */
public class EnumTester {

    public static void main(String[] args) {

        MyEnum.each {
            println(it)
        }

    }

}
