/**
 * Created by matthew on 10/16/2014.
 */
package Example

class Foo { var bar: String? = null }

public fun doSomething() {
    var nullable: Foo? = null
    var foo2: String?
    foo2 = nullable.bar// Compile Error!!!
    foo2 = nullable !!.bar
    foo2 = nullable.bar // No Error
    foo2 = nullable ?.bar ?.substring(0, 1)

    val immutableNullable: Foo? = null
    if (immutableNullable != null) {
        immutableNullable.bar
    }

    var mutableNullable = Foo()
    if (mutableNullable != null) {
        // Do Stuff
        mutableNullable.bar // Compile ERRROR!!!
    }
}