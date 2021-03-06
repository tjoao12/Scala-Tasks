object OrderingNumWord extends App {

  startMenu

  def startMenu {
    println("Press \n(1)for numbers \n(2)for words")
    val userInput = scala.io.StdIn.readInt()

    userInput match {
      case 1 => numbers
      case 2 => words
    }
  }

  def numbers {
    println("Enter your sequence of numbers")
    var num =readLine().split(" ").map(_.toInt)
    var num2 = num.sortWith(_ > _)

    for (x<- 0 to num2.length-1) {
      println(num2(x))
    }
    startMenu
  }

  def words {
    println("Enter your sequence of words")
    var wordSplit =readLine().split(" ")
    var wordSplit2 = wordSplit.sorted

    for (x<- 0 to wordSplit2.length-1) {
      println(wordSplit2(x))
    }
    startMenu
  }

}
