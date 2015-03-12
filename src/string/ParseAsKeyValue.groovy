package string

/**
 * Created by touhid on 12/03/2015.
 */
class ParseAsKeyValue {


    public static void main(String[] args) {
        def dataList = []
        def theInfoName = 'C:\\Users\\touhid\\Desktop\\abversion\\test.txt'

        File theInfoFile = new File( theInfoName )

        if( !theInfoFile.exists() ) {
            println "File does not exist"
        } else {
            def driveInfo = [:]
            // Step through each line in the file
            theInfoFile.eachLine { line ->
                // If the line isn't blank
                if( line.trim() ) {
                    // Split into a key and value

                    if (line.indexOf(":::") != -1){
                        def (key,value) = line.split( ':::' ).collect { it.trim() }
                        // and store them in the driveInfo Map
                        driveInfo."$key" = value
                    }
                }
                else {
                    // If the line is blank, and we have some info
                    if( driveInfo ) {
                        // store it in the list
                        dataList << driveInfo
                        // and clear it
                        driveInfo = [:]
                    }
                }
            }
            // when we've finished the file, store any remaining data
            if( driveInfo ) {
                dataList << driveInfo
            }
        }

        dataList.eachWithIndex { it, index ->
            println "Drive $index"
            it.each { k, v ->
                println "\t$k = $v"
            }
        }
    }



}
