/**
 * Created by matthew on 10/16/2014.
 */
public trait Callable {
    public var phoneNumber: String?
}

public abstract class Person: Callable {
    public var firstName: String? = ""
    public var lastName: String? = ""
    public val fullName : String
        get() = "${firstName} ${lastName}"
    public override var phoneNumber: String? = null
}

public class Employee: Person() {
    public var manager: Employee? = null

}