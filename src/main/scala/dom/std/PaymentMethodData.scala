package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentMethodData extends StObject {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var supportedMethods: java.lang.String | js.Array[java.lang.String] = js.native
}
object PaymentMethodData {
  
  @scala.inline
  def apply(supportedMethods: java.lang.String | js.Array[java.lang.String], data: js.Any = null): PaymentMethodData = {
    val __obj = js.Dynamic.literal(supportedMethods = supportedMethods.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodData]
  }
}
