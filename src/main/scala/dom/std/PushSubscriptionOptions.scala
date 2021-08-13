package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushSubscriptionOptions extends StObject {
  
  val applicationServerKey: ArrayBuffer | Null = js.native
  
  val userVisibleOnly: scala.Boolean = js.native
}
object PushSubscriptionOptions {
  
  @scala.inline
  def apply(userVisibleOnly: scala.Boolean, applicationServerKey: ArrayBuffer = null): PushSubscriptionOptions = {
    val __obj = js.Dynamic.literal(userVisibleOnly = userVisibleOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("applicationServerKey")(if (applicationServerKey != null) applicationServerKey.asInstanceOf[ArrayBuffer].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[PushSubscriptionOptions]
  }
}
