fun main () {
    var unserErsterInteger : Int = 24
    var unserZweiterInteger : Int = 9
    var unserDritterInteger : Int = 5

    // TODO: Wir wollen nun unsere Integer dividieren.
    //  Jedoch verlieren wir etwas, wenn wir diese einfach so teilen, was ist es?
    //  Passe die folgenden Divisionen so an, dass wir dies nicht mehr verlieren.
    //
    //
    //

    /* var ersterDurchZweiter = unserErsterInteger / unserZweiterInteger
    var ersterDurchDritter = unserErsterInteger / unserDritterInteger
    var zweiterDurchDritter = unserZweiterInteger / unserDritterInteger */

    var ersterDurchZweiter = (unserErsterInteger / unserZweiterInteger).toDouble()
    var ersterDurchDritter = (unserErsterInteger / unserDritterInteger).toDouble()
    var zweiterDurchDritter = (unserZweiterInteger / unserDritterInteger).toDouble()

    // Hier zeigen wir die Ergebnisse auf der Konsole.
    println(ersterDurchZweiter)
    println(ersterDurchDritter)
    println(zweiterDurchDritter)

    /* TODO: Versuche vorauszusagen, was in den folgenden Variablen steht, ohne diese zu printen.
     *  Danach kannst du gerne dein Ergebnis mit einem print prüfen.
     * 
     *
     */
    var grosseZahl = (unserErsterInteger.toString() + unserZweiterInteger.toString()).toInt()

    // "24"+"9" als Text also 249 als Int
    println(grosseZahl)

    var auchGrosseZahl = (unserZweiterInteger.toString() + unserDritterInteger.toString()).toInt()

    //"9"+"5" also 95
    println(auchGrosseZahl)

    var nichtGanzSoGrosseZahl = grosseZahl + auchGrosseZahl.toDouble() / 2

    //249.0+(95.0/2) also 95.0/2 = 47.5, 47.5 + 249.0 = 296,5
    println(nichtGanzSoGrosseZahl)

}