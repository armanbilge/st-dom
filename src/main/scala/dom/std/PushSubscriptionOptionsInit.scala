package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushSubscriptionOptionsInit extends StObject {
  
  var applicationServerKey: js.UndefOr[BufferSource | java.lang.String | Null] = js.native
  
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.native
}
object PushSubscriptionOptionsInit {
  
  @scala.inline
  def apply(
    applicationServerKey: js.UndefOr[Null | BufferSource | java.lang.String] = js.undefined,
    userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): PushSubscriptionOptionsInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applicationServerKey)) __obj.updateDynamic("applicationServerKey")(applicationServerKey.asInstanceOf[js.Any])
    if (!js.isUndefined(userVisibleOnly)) __obj.updateDynamic("userVisibleOnly")(userVisibleOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushSubscriptionOptionsInit]
  }
}
