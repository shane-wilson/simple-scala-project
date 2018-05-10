import java.awt.event.ItemListener
import scala.collection.Seq

/**
  * Created by shane on 10/05/18.
  */
class CheckoutController {

  def scanner(itemList: List[String]) = {
    val intList = itemList.foldRight(List(): List[Int])((currentElem, accum) => 
      currentElem match {
        case "A" => accum ++ List(50)
        case "B" => accum ++ List(30)
        case "C" => accum ++ List(20)
        case "D" => accum ++ List(15)
        case _ => accum
      }
    )
    totalCost(intList)
  }

  def totalCost(itemList: List[Int]) = {
    itemList.sum
  }

}
