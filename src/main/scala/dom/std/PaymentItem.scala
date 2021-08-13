package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentItem extends StObject {
  
  var amount: PaymentCurrencyAmount = js.native
  
  var label: java.lang.String = js.native
  
  var pending: js.UndefOr[scala.Boolean] = js.native
}
object PaymentItem {
  
  @scala.inline
  def apply(
    amount: PaymentCurrencyAmount,
    label: java.lang.String,
    pending: js.UndefOr[scala.Boolean] = js.undefined
  ): PaymentItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentItem]
  }
}
