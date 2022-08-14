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
    /**
     * Store Data in Collections
     */

    val birthday = Triple(17, 8, 1994)
    val person = Pair("Xie Wang", birthday)

    val nameUsingOrdering = person.first
    val birthdayUsingOrdering = person.second

    val (name, bday) = person       //don't mean we create two name variable.
    val (day, month, _) =bday       // you can not use year of bday

    val yearOfBirth = bday.third    //but you can still fetch the year of birthday
    println("$name was born on $day/$month, year unknown.")


//    val fullName = Pair<String, String>("Xie", "Wang")
//    val person = Pair(fullName, birthday)

//    val (name, lastName) = fullName
//    println("My name is $name $lastName.")
//    println("My name is ${fullName.first} ${fullName.second}.")




    /** Use Data Types & Operations
     *  Booleans & Comparison operators
     *  if else statement
     *  null - check null
      */
/*    var myAge: Int = 23
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


    // Combine Logical Operator
    val country = "USA"
    val isLegalDrivingAge =  (myAge > 18 && country == "Australia") || (country == "USA" && myAge >=16)
    println(isLegalDrivingAge)

    if (isLegalDrivingAge) {
        println("You can dirve!")
    } else {
        println("You've got a bit more time to go!")
    }

    // if else statement is also an expression which means it can be assigned as a value of some type.
    if (myAge >= 18) println("You can drive!") else println("You are underage!") //shortened the simple statement

    val ageMessage = if (myAge >= 18) "You can drive!" else "You are underage!"
    println(ageMessage)

    println(if (myAge >= 18) "You can drive!" else "You are underage!")
 */

//    var yearOfBirth = 1994
//
//    val generationCohort: String = if (yearOfBirth in 1965..1979) {     //specify return value type,(string,int, any..)
//        "Generation X"
//    } else if (yearOfBirth in 1980..1994) {
//        "Millenial"
//    } else {
//        "Generation Z"
//    }

//    println(generationCohort)
/*
    //challenge : if expression & boolean logic
    println("Welcome to registration, please enter your Username:")
    val userName = readln()

    println("Please enter you Password:")
    val password = readln()

    println("Please enter your email address:")
    val email = readln()

    val errorMessage: String = if (userName.isEmpty() || password.isEmpty() || email.isEmpty()) {
        "Cannot have empty properties."
    } else if (userName.length in 1..5) {
        "Username has at least 6 characters."
    } else if (password.length in 1..9) {
        "Password has at least 10 characters."
    } else if (!email.contains('@') || !email.contains('.')) {
        "Email address need to contains a '@' and a '.' ."
    } else {
        "Successful registration! "
    }

    println(errorMessage)
*/

    //create & consume nullables
//    val myName = "ariel"
//    val middlename: String? = null
//    println(middlename)
//
//    val middlenameLength: Double? = middlename?.length?.toDouble()
//    println(middlenameLength)
//
//    // null check
//    if (middlename != null) {
//        println("My middle name has ${middlename.length} characters.")
//    } else {
//        println("I don't have a middle name.")
//    }
//
//    if (middlename?.isEmpty() == true) {        // isEmpty() == true means no character in string, not-null.
//        println("I don't have a middle name. The length is ${middlename.length}")
//    }

//    val notNullMiddleName = requireNotNull(middlename)      //crashing the app once the value was null
//    println(notNullMiddleName)

//    val myMiddleName: String = middlename?: myName      //Elvis operator. if middlename is null, return myName. If middle name has value, reture middlename.
//    println(myMiddleName)
//
//    val lastBirthdayYear = 2019
//    val myAge: Int? =23
//
//    val myAgeNotNull: Int = myAge ?: return     // if myAge is null, program will return instead of continuing
//
//    yearOfBirth = lastBirthdayYear - myAgeNotNull
//    println("I was born in $yearOfBirth.")
//
//    // challenge: nullable
//    println("Please input password:")
//    var password: String? = readln()
//    val passwordLength: Int = password?.length?: 0
//
//    val message = if (passwordLength == 0) {
//        "Password cannot be empty."
//    } else if (passwordLength < 10) {
//        "The strength level of password is low."
//    } else {
//        "The strength level of password is high."
//    }
//
//    println(message)

//    val firstName = "sdf"
//    val lastName = ""
//    val isNameValid = firstName.isNotEmpty() && lastName.isNotEmpty()
//
//    val message = if (isNameValid) {
//        "Your fullname is $firstName $lastName."
//    } else {
//        "Please enter a valid fullname."
//    }
//
//    println(message)

//    // challenge
//    println("Please enter your first name:")
//    val firstName = readln()
//    println("Please enter your last name:")
//    val lastName = readln()
//    println("Please enter your nickname if you have:")
//    val nickname = readln()
//    println("Please enter your country:")
//    val country = readln()
//    println("Please enter your age:")
//    val age = readln()
//
//    val yearOfBirth = 2022 - age.toInt()
//    val printNickname = nickname?: ""
//
//    println("$firstName $printNickname $lastName, born on $yearOfBirth, in $country.")


} // fun main()


