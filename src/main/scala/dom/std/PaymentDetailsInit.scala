package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentDetailsInit
  extends StObject
     with PaymentDetailsBase {
  
  var id: js.UndefOr[java.lang.String] = js.native
  
  var total: PaymentItem = js.native
}
object PaymentDetailsInit {
  
  @scala.inline
  def apply(
    total: PaymentItem,
    displayItems: js.Array[PaymentItem] = null,
    id: java.lang.String = null,
    modifiers: js.Array[PaymentDetailsModifier] = null,
    shippingOptions: js.Array[PaymentShippingOption] = null
  ): PaymentDetailsInit = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetailsInit]
  }
}
