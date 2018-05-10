import org.specs2.mutable._

/**
  * Created by shane on 10/05/18.
  */
class CheckoutControllerSpec extends Specification {

  val controller = new CheckoutController

  "the checkout" should {
    "display the total amount when 1 item is scanned" in {
      controller.scanner(List("A")) mustEqual 50
    }

    "display the total amount when 3 different items are scanned" in {
      controller.scanner(List("A", "B")) mustEqual 80

    }
  }

}
