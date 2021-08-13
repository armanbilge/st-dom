package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentDetailsUpdate
  extends StObject
     with PaymentDetailsBase {
  
  var error: js.UndefOr[java.lang.String] = js.native
  
  var payerErrors: js.UndefOr[PayerErrors] = js.native
  
  var paymentMethodErrors: js.UndefOr[js.Any] = js.native
  
  var shippingAddressErrors: js.UndefOr[AddressErrors] = js.native
  
  var total: js.UndefOr[PaymentItem] = js.native
}
object PaymentDetailsUpdate {
  
  @scala.inline
  def apply(
    displayItems: js.Array[PaymentItem] = null,
    error: java.lang.String = null,
    modifiers: js.Array[PaymentDetailsModifier] = null,
    payerErrors: PayerErrors = null,
    paymentMethodErrors: js.Any = null,
    shippingAddressErrors: AddressErrors = null,
    shippingOptions: js.Array[PaymentShippingOption] = null,
    total: PaymentItem = null
  ): PaymentDetailsUpdate = {
    val __obj = js.Dynamic.literal()
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (payerErrors != null) __obj.updateDynamic("payerErrors")(payerErrors.asInstanceOf[js.Any])
    if (paymentMethodErrors != null) __obj.updateDynamic("paymentMethodErrors")(paymentMethodErrors.asInstanceOf[js.Any])
    if (shippingAddressErrors != null) __obj.updateDynamic("shippingAddressErrors")(shippingAddressErrors.asInstanceOf[js.Any])
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetailsUpdate]
  }
}
