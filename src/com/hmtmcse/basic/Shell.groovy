package com.hmtmcse.basic

import java.util.concurrent.atomic.AtomicInteger

/**
 * Created by touhid on 21/02/2015.
 */
class Shell {



    def counter = new AtomicInteger()

    synchronized out(data) {
        println(data)
    }

    public static void main(String[] args) {

        int x = 0;

        def process = "ping google.com -t".execute();
        process.in.eachLine { line ->
            println line
            println(x)
            if (x == 20){
                process.destroy();
            }
            x++;

        }


//        def shell = new Shell();
//        shell.threadTest();
    }



    def threadTest(){
        def th = Thread.start {
            for( i in 1..1000 ) {
                sleep 30
                out "thread loop $i"
                counter.incrementAndGet()
            }
        }



        for( j in 1..4 ) {
            sleep 50
            out "main loop $j"
            counter.incrementAndGet()
        }

        th.interrupt()

        th.join()

        assert counter.get() == 12
    }







}
