/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val diceRange: IntRange = 1..100
    val randomNumber = diceRange.random()
    println("Random number: ${randomNumber}")
    
    if(randomNumber % 2 ==0)
            println("Angka ${randomNumber} merupakan Bilangan Genap")
        else
            println("Angka ${randomNumber} merupakan Bilangan Ganjil")
    
    println("Himpunan Bilangan Genap")
    var hitung = 0
    for (angka in diceRange){
         if(angka % 2 ==0)
         	
         	print(" " + angka)
            else
        	hitung++
    }    
    println(" ")
    println("Himpunan Bilangan Ganjil")
    var start = 0
    for (angka in diceRange){
         if(angka % 2 !=0)
         	
         	print(" " + angka)
            else
        	start++
    }    
}
