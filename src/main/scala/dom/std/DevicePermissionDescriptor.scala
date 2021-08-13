package dom.std

import dom.std.stdStrings.camera
import dom.std.stdStrings.microphone
import dom.std.stdStrings.speaker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicePermissionDescriptor
  extends StObject
     with PermissionDescriptor {
  
  var deviceId: js.UndefOr[java.lang.String] = js.native
  
  @JSName("name")
  var name_DevicePermissionDescriptor: camera | microphone | speaker = js.native
}
object DevicePermissionDescriptor {
  
  @scala.inline
  def apply(name: camera | microphone | speaker, deviceId: java.lang.String = null): DevicePermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePermissionDescriptor]
  }
}
