package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentOptions extends StObject {
  
  var requestBillingAddress: js.UndefOr[scala.Boolean] = js.native
  
  var requestPayerEmail: js.UndefOr[scala.Boolean] = js.native
  
  var requestPayerName: js.UndefOr[scala.Boolean] = js.native
  
  var requestPayerPhone: js.UndefOr[scala.Boolean] = js.native
  
  var requestShipping: js.UndefOr[scala.Boolean] = js.native
  
  var shippingType: js.UndefOr[PaymentShippingType] = js.native
}
object PaymentOptions {
  
  @scala.inline
  def apply(
    requestBillingAddress: js.UndefOr[scala.Boolean] = js.undefined,
    requestPayerEmail: js.UndefOr[scala.Boolean] = js.undefined,
    requestPayerName: js.UndefOr[scala.Boolean] = js.undefined,
    requestPayerPhone: js.UndefOr[scala.Boolean] = js.undefined,
    requestShipping: js.UndefOr[scala.Boolean] = js.undefined,
    shippingType: PaymentShippingType = null
  ): PaymentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requestBillingAddress)) __obj.updateDynamic("requestBillingAddress")(requestBillingAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(requestPayerEmail)) __obj.updateDynamic("requestPayerEmail")(requestPayerEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(requestPayerName)) __obj.updateDynamic("requestPayerName")(requestPayerName.asInstanceOf[js.Any])
    if (!js.isUndefined(requestPayerPhone)) __obj.updateDynamic("requestPayerPhone")(requestPayerPhone.asInstanceOf[js.Any])
    if (!js.isUndefined(requestShipping)) __obj.updateDynamic("requestShipping")(requestShipping.asInstanceOf[js.Any])
    if (shippingType != null) __obj.updateDynamic("shippingType")(shippingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentOptions]
  }
}
