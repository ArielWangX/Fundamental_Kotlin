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
     *  Store Unique Data in Sets
     */
//    var userIds = setOf("ID18", "ID20", "ID13")
//    println(userIds)
//    println(userIds.contains("ID18"))
//    println("ID18" in userIds)
//
//    val mutableIds = userIds.toMutableSet()
//    println(mutableIds.add("ID35"))
//    println(mutableIds)
//
//    println(mutableIds.remove("ID18"))
//
//    for (userID in mutableIds) {
//        println(userID)
//    }
//
//    // challenge
//    val itemOnDesk = listOf<String>("Laptop","mouse","Keyboard", "Screen","Phone","Screen")
//    val setItemOnDesk = itemOnDesk.toMutableSet()
//    println(setItemOnDesk)
//
//    setItemOnDesk.remove("Phone")
//    println(setItemOnDesk)
//
//    for (item in setItemOnDesk) {
//        println(item)
//    }


    /**
     * Create & Access Maps
     * Work with Maps
     */
//    val moviesCollection = mutableMapOf<String, MutableList<String>>()
//    println(moviesCollection)
//    moviesCollection["Action"] = mutableListOf("Taken", "John Wick")    //.put ---add pair(key,value) in maps
//    println(moviesCollection)
//
//    val actionMovies = moviesCollection["Action"]
//    println(actionMovies)
//
//    val horrorMovies = moviesCollection["Horror"]
//    println(horrorMovies)
//
//    val authenticationHeaders = mapOf(
//        "API_KEY" to "your-api-key",
//        "Authorization" to "auth token",
//        "content/type" to "application/json"
//    )
//    println(authenticationHeaders)
//
//    // ---
//
//    moviesCollection["Horror"] = mutableListOf()
//    println(moviesCollection)
//
//    moviesCollection["Horror"] = mutableListOf("Get Out")
//    println(moviesCollection)
//
//    moviesCollection["Horror"]?.add("Midsommar")    // add element in map value
//    println(moviesCollection)
//
//    val removeActionMovies = moviesCollection.remove("Action")  // remove key of map and return the previous value
//    println(removeActionMovies)
//    println(moviesCollection)
//
//    moviesCollection["Horror"]?.add("dsfsfd")
//    moviesCollection["Comedy"] = mutableListOf("ted")
//
//    for (key in moviesCollection.keys) {
//        println(key)
//    }
//
//    for (value in moviesCollection.values) {
//        println(value)
//    }
//
//    for ((key,value) in moviesCollection) {
//        println("key is $key, value is $value")
//    }

//    // challenge
//    val petIHave = mutableMapOf<String, MutableList<String>>()
//    petIHave["Jello"] = mutableListOf("JellyFish")
//    petIHave["Button"] = mutableListOf("Laborador")
//
//    petIHave["Button"]?.add("Golden Retriever")
//    println(petIHave)
//    petIHave["Button"]?.remove("Golden Retriever")
//    println(petIHave)
//
//    for (key in petIHave.keys) {
//        println(key)
//    }
//
//    for (value in petIHave.values) {
//        println(value)
//    }


    /**
     * Functions & Nullability
     */
//    fun createRange(start: Int, end: Int, isHalfOpen: Boolean = false): IntRange {
//        if (isHalfOpen) {
//            return start until end
//        } else {
//            return start..end
//        }
//    }
//
//    val halfOpenRange = createRange(5,10,true)
//    println(halfOpenRange)

    /**
     * Manage Control Flow
     */
//    // Challenge: Use When Expressions
//    val year = 1978
//
//    val message = when (year) {
//        in 1800..1899 -> "It is in 18 century."
//        in 1900..1999 -> "It is in 19 century"
//        in 2000..2100 -> "It is 20 century"
//        else -> "This was looong ago!"
//    }
//
//    println(message)

//    // Simplify Code with When Expressions
//    val age = 23
//
//    val message = when (age) {
//        in 0..12 -> "Still a young human"
//        in 13..19 -> "Teenager"
//        in 20..29 -> "In your twenties"
//        in 30..39 -> "In your forties"
//        else -> "You are a wise person :]"
//    }
//
//    println(message)
//
//    val email = "john@email.com"
//    val password = "32eddsfsfswf4"
//
//    when {
//        email.isEmpty() -> {
//            println("You need to choose an email")
//        }
//        "@" !in email -> {
//            println("Your email is invalid")
//        }
//        password.isEmpty() -> {
//            println("You need to enter a password")
//        }
//        password.length < 10 -> {
//            println("Password not strong enough")
//        }
//        else -> {
//            println("Email is $email " + "Password length: ${password.length}" )
//        }
//    }

    //Challenge: Iterating Collections
//    Create a matrix with array
//    val matrixRow = 5
//    val matrixColumn = 8
//    val matrixArray = Array(matrixRow) {Array(matrixColumn) {"."} }

//    val matrix = MutableList<MutableList<String>>(7) { MutableList(7) {"."} }
//
//    matrix[2][4] = "X"
//
//    for (row in matrix) {
//        println(row)
//    }
//
//    println("-----")
//
//    loop@for (row in 0..matrix.lastIndex) {
//        println("Searching in row $row")
//        for (column in 0..matrix.lastIndex) {
//            if (matrix[row][column] == "X") {
//                println("Found X at: $row:$column")
//                break@loop
//            } else {
//                print(".\t")
//            }
//        }
//        println()
//    }


//    // Iterate Over Collections
//    val weekdays = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    val listWeekdays = weekdays.toList()
//
//    for (day in listWeekdays) {
//        if (day == "Monday") {
//            continue        //skip this element
//        }
//        println(day)
//
//        if (day == "Thursday") {
//            println("Get ready for the weekend!")
//            break       //break the entire loop
//        }
//    }
//
//    val matrix = MutableList<MutableList<String>>(size = 5) {
//        MutableList(5) {""}
//    }
//
//    for (row in 0..matrix.lastIndex) {
//        for (column in 0..matrix.lastIndex) {
//            matrix[row][column] = "$row:$column"        // assign value to matrix
//        }
//    }
//
//    println(matrix)     //print row & column
//    println("------")
//
//    for (row in matrix) {
//        println(row)        // print row
//    }
//
//    val thirdRowFifthColumnElement = matrix[2][4]
//    println(thirdRowFifthColumnElement)
//
//    row@ for (row in 0..5) {        // add label for loop
//        column@ for (column in 0..5) {
//            if (column == 2 && row == 2) {
//                break@row
//            }
//            print("x\t")
//        }
//       println()
//    }



//    // Challenge: For loop
//    val rangeOfNumber = 0..19
//    for (number in rangeOfNumber) {
//        print(number)
//    }
//
//    println("")
//
//    for (number in rangeOfNumber step 3) {
//        print(number)
//    }
//
//    println("")
//
//    val rangeOfDecreasingNumber = 15 downTo 1
//    for (number in rangeOfDecreasingNumber step 2) {
//        print(number)
//    }
//    // For loop
//    val rangeFromZeroToTen = 0..10
//    println(rangeFromZeroToTen)
//
//    val exclusiveRange = 0 until 10
//    println(exclusiveRange)
//
//    for (index in rangeFromZeroToTen step 2) {
//        print(index)
//    }
//
//    println("")
//
//    for (index in 10 downTo 0 step 2) {
//        print(index)
//    }
//
//    println("")
//
//    val countries = arrayOf("China", "Australia", "Japan","Hungary","Serbia")
//
//    for (countryIndex:Int in countries.indices) {
//        println("${countries[countryIndex]}")
//    }
//
//    println("")
//
//    for (country in countries) {
//        println("$country")
//    }



////    Challenge: While Loop
//     var i = 0
//    while (i < 15) {
//        println(i + 1)
//        i++
//    }
//
//    val name = arrayOf("name1","name2","name3","name4","name5","name6")
//    var index = name.lastIndex
//
//    do {
//        if (index > name.lastIndex || index < 0) return
//
//        println(name[index])
//        index -= 1
//    } while (index >= 0 && index < name.size)

////  Loop using while loops
//    val countries = arrayOf("China", "Australia", "Japan","Korea","USA")

//    var i = 0
//    while (i < countries.size) {
//        println("Country at index $i is ${countries[i]}")
//        i += 1
//    }

//    var i = 5
//    do {
//        println("Country at index $i is ${countries[i]}")
//        i += 1
//    } while (i < countries.size)

    /**
     * Store Data in Collections
     * Collections in memory
     * Big O notation
     * Array - static collection
     * List - Dynamic collection
     */
//// Challenge: conclusion
//    val weekdays = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    weekdays[4] = "lastWorkDayInAWeek"
//    println(weekdays)
//
//    val mutableWeekdays = weekdays.toMutableList()
//    mutableWeekdays.add("hopeCanHaveThreeHolidays")
//    mutableWeekdays.remove("Thursday")
//
//    println(mutableWeekdays)
//
//    val removeExist = "Thursday" in mutableWeekdays
//    println(removeExist)
//
//// Challenge: Array & Lists
//    val favoriteGame = arrayOf("game1","game2","game3","game4","game5")
//    favoriteGame[3] = "game6"
//    println(favoriteGame[1])
//    println(favoriteGame)
//
////    val mutableFavoriteGameList = mutableListOf("game1","game2","game3","game4","game5")
//    val mutableFavoriteGameList = favoriteGame.toMutableList()
//    println(mutableFavoriteGameList)
//    mutableFavoriteGameList.add("game7")
//    mutableFavoriteGameList.add(2, "game8")
//    println(mutableFavoriteGameList)
//
//    mutableFavoriteGameList.removeAt(5)
//    println(mutableFavoriteGameList)


// Create Lists of Data
//    val countries = listOf("China", "Australia", "Japan")     // immutable list
//
// //    val mutableListOfCountries = mutableListOf("China", "Australia", "Japan")       //mutable list: can add or remove elements
//    val mutableListOfCountries = countries.toMutableList()      // interchangeable between collections
//    println(mutableListOfCountries)
//
//    mutableListOfCountries.add("Germany")       // append at the end
//    mutableListOfCountries.add(1,"Greece")      // add element in specific position (cause list shift - slower adding way)
//    println(mutableListOfCountries)
//
//    mutableListOfCountries.addAll(3, listOf("Spain","USA","Poland"))        // add more elements at once
//    println(mutableListOfCountries)
//    println(mutableListOfCountries.size)
//
//    val visitedChina = "China"      //booleans check
//    println(mutableListOfCountries.contains(visitedChina))  //contains()
//
//    val hasVisitedChina = visitedChina in mutableListOfCountries        // in operator
//    println(hasVisitedChina)
//
//    mutableListOfCountries.remove("Poland")     //remove element
//    mutableListOfCountries.removeAt(3)
//    mutableListOfCountries.removeAll(listOf("Greece", "Germany"))       //remove elements
//
//    println(mutableListOfCountries)
//
//    mutableListOfCountries[2] = "Greece"    // add element
//    val combineList = countries + mutableListOfCountries        //combine lists
//    val emptyList = emptyList<String>()     // create empty list
//
//    println(mutableListOfCountries)
//    println(combineList)
//    println(emptyList)
//
//    mutableListOfCountries.clear()      // clear the list using clear()
//    println(mutableListOfCountries)


//    val countries = listOf("China", "Australia", "Japan")     // immutable list
//    println(countries)

// Allocate Arrays
//    val visitedCountries = arrayOf<String>(     //creating an array using arrayOf() approach
//        "China","Australia","Japan","Korea"
//    )
//
//    println(visitedCountries)       //print out the memory address
//    println(visitedCountries.size)      //how many items are in the array
//    println(visitedCountries[3])        //position relative to the very first item in the array. (zero index based)
//
//    visitedCountries[3] = "the USA"     //change the internal structure of array
//    println(visitedCountries[3])
//
//    val sizedArray = Array(10) {""}     //creating array using array constructor
//    val emptyArray = emptyArray<String>()       //creating and empty array
//
//    val arrayOfInts = intArrayOf(2,3,4,5,6,7)
//    println(arrayOfInts)
//
//    val intArray = IntArray(10)
//    println(intArray)
//
//    println(visitedCountries.lastIndex)
//    println(visitedCountries.last())
//    println(visitedCountries.first())
//
//    val currentCountry = "Spain"
//    println(visitedCountries.contains(currentCountry))      //contains() booleans
//
//    val hasVisitedSpain = currentCountry in visitedCountries        //an operator called in
//    val hasNotVisitedSpain = currentCountry !in visitedCountries
//    println(hasVisitedSpain)
//    println(hasNotVisitedSpain)

//  Challenge: Pairs and Triples
//    val creditCard = Triple("cardNumber", "securityCode", "Visa")
//    val bankAccount = Triple("Xie Wang", creditCard, "balance")
//    val (cardNumber, _,typeOfCard) = creditCard
//
//    println("${bankAccount.first}, $cardNumber, $typeOfCard, ${bankAccount.third}.")

//  Combine Data in Pairs and Triples
//    val fullName = Pair("Ariel", "Wang")
//    val (firstName, lastName) = fullName        // destructuring to break down a pair to 2 pieces.
//    val personConstant = Pair(fullName, 31)
//
//
//    //println("Her name is: ${fullName.first} ${fullName.second}")
//    println("Her name is: ${firstName} ${lastName}")

//    val birthday = Triple(17, 8, 1994)
//    val person = Pair("Xie Wang", birthday)
//
//    val nameUsingOrdering = person.first
//    val birthdayUsingOrdering = person.second
//
//    val (name, bday) = person       //don't mean we create two name variable.
//    val (day, month, _) =bday       // you can not use year of bday
//
//    val yearOfBirth = bday.third    //but you can still fetch the year of birthday
//    println("$name was born on $day/$month, year unknown.")
//
//    val fullName = Pair<String, String>("Xie", "Wang")
//    val person = Pair(fullName, birthday)
//
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


