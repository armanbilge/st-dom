package dom.std

import dom.std.stdStrings.push
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushPermissionDescriptor
  extends StObject
     with PermissionDescriptor {
  
  @JSName("name")
  var name_PushPermissionDescriptor: push = js.native
  
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.native
}
object PushPermissionDescriptor {
  
  @scala.inline
  def apply(userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined): PushPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = "push")
    if (!js.isUndefined(userVisibleOnly)) __obj.updateDynamic("userVisibleOnly")(userVisibleOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushPermissionDescriptor]
  }
}
