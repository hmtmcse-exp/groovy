package com.hmtmcse.basic.http



import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*

@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.5.0-RC3' )

/**
 * Created by Touhid Mia on 12/01/2015.
 */


class HttpRequester {


    public static void main(String[] args) {
        def http = new HTTPBuilder( 'http://localhost:8080/GrailsForBeginner/' )

// perform a GET request, expecting JSON response data
        http.request( GET, JSON ) {
            uri.path = '/ajax/services/search/web'
            uri.query = [ v:'1.0', q: 'Calvin and Hobbes' ]

            headers.'User-Agent' = 'Mozilla/5.0 Ubuntu/8.10 Firefox/3.0.4'

            // response handler for a success response code:
            response.success = { resp, json ->
                println resp.statusLine

                // parse the JSON response object:
                json.responseData.results.each {
                    println "  ${it.titleNoFormatting} : ${it.visibleUrl}"
                }
            }

            // handler for any failure status code:
            response.failure = { resp ->
                println "Unexpected error: ${resp.statusLine.statusCode} : ${resp.statusLine.reasonPhrase}"
            }
        }
    }

}
