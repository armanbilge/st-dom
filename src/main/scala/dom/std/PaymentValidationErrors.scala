package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentValidationErrors extends StObject {
  
  var error: js.UndefOr[java.lang.String] = js.native
  
  var payer: js.UndefOr[PayerErrors] = js.native
  
  var paymentMethod: js.UndefOr[js.Any] = js.native
  
  var shippingAddress: js.UndefOr[AddressErrors] = js.native
}
object PaymentValidationErrors {
  
  @scala.inline
  def apply(
    error: java.lang.String = null,
    payer: PayerErrors = null,
    paymentMethod: js.Any = null,
    shippingAddress: AddressErrors = null
  ): PaymentValidationErrors = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (payer != null) __obj.updateDynamic("payer")(payer.asInstanceOf[js.Any])
    if (paymentMethod != null) __obj.updateDynamic("paymentMethod")(paymentMethod.asInstanceOf[js.Any])
    if (shippingAddress != null) __obj.updateDynamic("shippingAddress")(shippingAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentValidationErrors]
  }
}
