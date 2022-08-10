import java.util.TimeZone

/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can also reference parameters, like the [arguments].
 *
 * @param arguments
 * @author xie
 */
fun main(arguments: Array<String>) {
    var myAge: Int = 23
    val name: String = "Xie"
    val lastName = "Wang"
    val weight = 51.2       //double

    println(weight)

    myAge += 1
    println("I am $myAge years old.")

    println("$name $lastName is $myAge years old, and weight $weight kg.")

    val fullName = "$lastName, $name"
    println(fullName)

    val ageAsString = myAge.toString()
    println(ageAsString)

    val ageFromString = "28".toInt()
    println(ageFromString)

    val nameLength = fullName.length
    println(nameLength)

    // this is a line comment

    /*
        this is a multiline comment.
    */

    val isProgrmamingAwesome = true
    println("Is programming awesome? $isProgrmamingAwesome.")

    val legalDrivingAge = myAge >= 18               //Boolean assignment
    println(legalDrivingAge)

    val ageTim = 27
    val isTimOlder = ageTim > myAge
    println(isTimOlder)

    val strangerName = "Tim"
    var sameName = fullName == strangerName
    println(sameName)

    sameName = fullName != strangerName
    println(sameName)

    println(!sameName)      //inverting value or flipping value

    val firstObject = Any()
    val secondObject = Any()
    println(firstObject === secondObject)       //check if they are stored in same memory address or not.
    println(firstObject !== secondObject)

    val isNameEmpty = fullName.isEmpty()
    println(isNameEmpty)

    //challenge 1 check and store in a Boolean if a password is secure - at least 10 characters.
    println("Please enter you password:")
    val password = readln()

    val secure = password.length >= 10
    println(secure)

    //challenge 2 if two people have the same name length
    println("Please enter your name:")
    val name1 = readln()

    println("Please enter your name:")
    val name2 = readln()

    val sameNameLength = name1.length == name2.length
    println(sameNameLength)


}