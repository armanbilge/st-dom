package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The MediaDevicesInfo interface contains information that describes a single media input or output device. */
@js.native
trait MediaDeviceInfo extends StObject {
  
  val deviceId: java.lang.String = js.native
  
  val groupId: java.lang.String = js.native
  
  val kind: MediaDeviceKind = js.native
  
  val label: java.lang.String = js.native
  
  def toJSON(): js.Any = js.native
}
object MediaDeviceInfo {
  
  @scala.inline
  def apply(
    deviceId: java.lang.String,
    groupId: java.lang.String,
    kind: MediaDeviceKind,
    label: java.lang.String,
    toJSON: () => js.Any
  ): MediaDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[MediaDeviceInfo]
  }
}
