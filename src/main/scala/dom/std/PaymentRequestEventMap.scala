package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentRequestEventMap extends StObject {
  
  var paymentmethodchange: Event = js.native
  
  var shippingaddresschange: Event = js.native
  
  var shippingoptionchange: Event = js.native
}
object PaymentRequestEventMap {
  
  @scala.inline
  def apply(paymentmethodchange: Event, shippingaddresschange: Event, shippingoptionchange: Event): PaymentRequestEventMap = {
    val __obj = js.Dynamic.literal(paymentmethodchange = paymentmethodchange.asInstanceOf[js.Any], shippingaddresschange = shippingaddresschange.asInstanceOf[js.Any], shippingoptionchange = shippingoptionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestEventMap]
  }
}
