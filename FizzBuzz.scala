object task3 extends App {
  def task13(a: String, b: String, c: Int) {

    var word = a

    var word2 = b

    var amount = 1


    while (amount <= c) {

      if ((amount % 3 == 0) & (amount % 5 == 0)) {

        println(word + word2)

      }

      else if (amount % 3 == 0) {

        println(word)

      }

      else if (amount % 5 == 0) {

        println(word2)

      }

      else {

        println(amount)

      }

      amount = amount + 1

    }

  }

  task13("Fizz", "Buzz", 50)
}