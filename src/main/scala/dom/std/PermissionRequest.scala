package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionRequest
  extends StObject
     with DeferredPermissionRequest {
  
  def defer(): Unit = js.native
  
  val state: MSWebViewPermissionState = js.native
}
object PermissionRequest {
  
  @scala.inline
  def apply(
    allow: () => Unit,
    defer: () => Unit,
    deny: () => Unit,
    id: Double,
    state: MSWebViewPermissionState,
    `type`: MSWebViewPermissionType,
    uri: java.lang.String
  ): PermissionRequest = {
    val __obj = js.Dynamic.literal(allow = js.Any.fromFunction0(allow), defer = js.Any.fromFunction0(defer), deny = js.Any.fromFunction0(deny), id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionRequest]
  }
}
