package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCSessionDescriptionInit extends StObject {
  
  var sdp: js.UndefOr[java.lang.String] = js.native
  
  var `type`: RTCSdpType = js.native
}
object RTCSessionDescriptionInit {
  
  @scala.inline
  def apply(`type`: RTCSdpType, sdp: java.lang.String = null): RTCSessionDescriptionInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (sdp != null) __obj.updateDynamic("sdp")(sdp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSessionDescriptionInit]
  }
}
