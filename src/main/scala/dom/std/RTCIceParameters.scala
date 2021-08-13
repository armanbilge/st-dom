package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceParameters extends StObject {
  
  var password: js.UndefOr[java.lang.String] = js.native
  
  var usernameFragment: js.UndefOr[java.lang.String] = js.native
}
object RTCIceParameters {
  
  @scala.inline
  def apply(password: java.lang.String = null, usernameFragment: java.lang.String = null): RTCIceParameters = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (usernameFragment != null) __obj.updateDynamic("usernameFragment")(usernameFragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceParameters]
  }
}
