/**
 * Created by matthew on 10/16/2014.
 */

fun getFirstChars(strings: Iterable<String> ): Iterable<String> {
    return strings
            .filter({it.isNotEmpty()})
            .map { x -> x.substring(0, 1) }
}

fun doSomething() {
    val immutable = "immutable"
    var mutable = "mutable"
}