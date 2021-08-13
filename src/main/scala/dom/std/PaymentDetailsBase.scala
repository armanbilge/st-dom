package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentDetailsBase extends StObject {
  
  var displayItems: js.UndefOr[js.Array[PaymentItem]] = js.native
  
  var modifiers: js.UndefOr[js.Array[PaymentDetailsModifier]] = js.native
  
  var shippingOptions: js.UndefOr[js.Array[PaymentShippingOption]] = js.native
}
object PaymentDetailsBase {
  
  @scala.inline
  def apply(
    displayItems: js.Array[PaymentItem] = null,
    modifiers: js.Array[PaymentDetailsModifier] = null,
    shippingOptions: js.Array[PaymentShippingOption] = null
  ): PaymentDetailsBase = {
    val __obj = js.Dynamic.literal()
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetailsBase]
  }
}
