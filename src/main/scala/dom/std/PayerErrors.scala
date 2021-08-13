package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayerErrors extends StObject {
  
  var email: js.UndefOr[java.lang.String] = js.native
  
  var name: js.UndefOr[java.lang.String] = js.native
  
  var phone: js.UndefOr[java.lang.String] = js.native
}
object PayerErrors {
  
  @scala.inline
  def apply(email: java.lang.String = null, name: java.lang.String = null, phone: java.lang.String = null): PayerErrors = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayerErrors]
  }
}
