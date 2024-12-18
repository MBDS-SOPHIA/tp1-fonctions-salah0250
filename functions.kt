
fun printEvenOrOdd(x: Int, even: Boolean) {
    var count = 0
    var number = if (even) 0 else 1
    while (count < x) {
        println(number)
        number += 2
        count++
    }
}


fun printFibonacci(x: Int) {
    var a = 0
    var b = 1

    for (i in 1..x) {
        println(a)
        val temp = a + b
        a = b
        b = temp
    }
}


fun factorial(x: Int = 10): Long {
    var result = 1L
    for (i in 1..x) {
        result *= i
    }
    return result
}


fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    for (i in 3..Math.sqrt(n.toDouble()).toInt() step 2) {
        if (n % i == 0) return false
    }
    return true
}


fun printFirstPrimes(x: Int) {
    var count = 0
    var number = 2
    while (count < x) {
        if (isPrime(number)) {
            println(number)
            count++
        }
        number++
    }
}

fun main() {

    println("Les 5 premiers nombres pairs :")
    printEvenOrOdd(5, true)

    println("\nLes 5 premiers nombres impairs :")
    printEvenOrOdd(5, false)

    println("\nLes 10 premiers termes de Fibonacci :")
    printFibonacci(10)

    println("\nFactoriel de 10 (par défaut) : ${factorial()}")
    println("Factoriel de 5 : ${factorial(5)}")

    println("\nLes 5 premiers nombres premiers :")
    printFirstPrimes(5)
}
