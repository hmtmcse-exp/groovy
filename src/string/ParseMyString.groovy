package string

/**
 * Created by touhid on 17/02/2015.
 */
class ParseMyString {

    public static void main(String[] args) {
        def selectedField = "select test, data FROM Order GROUP by Account.uuid".trim().toLowerCase()
        Integer selectIndex = selectedField.indexOf("select");
        Integer from = selectedField.lastIndexOf("from");
        if (from != -1 && selectIndex != -1){
            def column = selectedField.substring(selectIndex + 6 ,from).trim();
            println(column)
        }
    }


}
