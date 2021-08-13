package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentShippingOption extends StObject {
  
  var amount: PaymentCurrencyAmount = js.native
  
  var id: java.lang.String = js.native
  
  var label: java.lang.String = js.native
  
  var selected: js.UndefOr[scala.Boolean] = js.native
}
object PaymentShippingOption {
  
  @scala.inline
  def apply(
    amount: PaymentCurrencyAmount,
    id: java.lang.String,
    label: java.lang.String,
    selected: js.UndefOr[scala.Boolean] = js.undefined
  ): PaymentShippingOption = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentShippingOption]
  }
}
