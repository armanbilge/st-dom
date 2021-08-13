package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentDetailsModifier extends StObject {
  
  var additionalDisplayItems: js.UndefOr[js.Array[PaymentItem]] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var supportedMethods: java.lang.String | js.Array[java.lang.String] = js.native
  
  var total: js.UndefOr[PaymentItem] = js.native
}
object PaymentDetailsModifier {
  
  @scala.inline
  def apply(
    supportedMethods: java.lang.String | js.Array[java.lang.String],
    additionalDisplayItems: js.Array[PaymentItem] = null,
    data: js.Any = null,
    total: PaymentItem = null
  ): PaymentDetailsModifier = {
    val __obj = js.Dynamic.literal(supportedMethods = supportedMethods.asInstanceOf[js.Any])
    if (additionalDisplayItems != null) __obj.updateDynamic("additionalDisplayItems")(additionalDisplayItems.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetailsModifier]
  }
}
