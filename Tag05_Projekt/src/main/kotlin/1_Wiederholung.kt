fun main() {

    /* TODO a: Befülle die Values
    val NAME: String =
    val FIRST_NAME: String =
    val LAST_NAME: String = */

    val NAME: String = "Maja"
    val FIRST_NAME: String = "Maja"
    val LAST_NAME: String = "Teichmann"

    println(NAME + " " + FIRST_NAME + " " + LAST_NAME)

    /* // TODO b: Benenne die Values
    val : String = "0123 45678910"
    val : String = "Blau"
    val : String = "Hamburger" */

    val zahl: String = "0123 45678910"
    val farbe: String = "Blau"
    val nahrungsMittel: String = "Hamburger"

    println(zahl + " " + farbe + " " + nahrungsMittel)

     /* // TODO c: Befülle die Variablen neu
    var country: String = "Spanien"
    country = */

    var country: String = "Spanien"
    country = "Portugal"

    var city: String = "Berlin"
    city ="Hamburg"

    println(country + " " + city)
    
     /* // TODO d: Befülle die Variable mit einer Eingabe des Users
    var continent: String = */

    var continent: String = readln()
    println("Gib einen Kontinent ein!")

    /* // TODO e: Schlüsselwort var oder val einfügen
    TIME: String = "09:00"
    placeOfBirth: String = "München"
    PET_NAME: String = "Brutus"
    currentTVShow: String = "Breaking Bad"
    lastVacation: String = "Tokyo" */

    var TIME: String = "09:00"
    val placeOfBirth: String = "München"
    val PET_NAME: String = "Brutus"
    var currentTVShow: String = "Breaking Bad"
    var lastVacation: String = "Tokyo"

    println("Es ist aktuell $TIME Uhr.")
    println("Ich wurde in $placeOfBirth geboren.")
    println("Mein Haustier heißt $PET_NAME.")
    println("Aktuell schaue ich $currentTVShow.")
    println("Mein letzter Urlaub ging nach $lastVacation.")

    
    // TODO: Nutze Println um dem User eine kleine Textbeschreibung auszugeben

    println("Mein Name ist $FIRST_NAME $LAST_NAME. Meine Familie nennt mich aber einfach $NAME. \n " +
            "Ich wurde in $placeOfBirth geboren und wohne in $city, $country, $continent. \n " +
            "Meine Lieblingsfarbe ist $farbe, mein Lieblingsessen $nahrungsMittel und meine Lieblingszahlenfolge \n " +
            "ist die $zahl. Aktuell ist es $TIME Uhr, mein Haustier heißt $PET_NAME, meine Lieblingsserie ist aktuell \n " +
            "$currentTVShow und zuletzt war ich in $lastVacation im urlaub.")

}