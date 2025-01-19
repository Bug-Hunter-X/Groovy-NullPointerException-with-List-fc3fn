```groovy
def myMethod(List<String> list) {
    if (list != null) {
        list.each { element ->
            println element
        }
    } else {
        println "The list is null"
    }
}

myMethod(null)
myMethod(['a', 'b', 'c'])