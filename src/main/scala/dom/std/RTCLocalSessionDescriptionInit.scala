package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCLocalSessionDescriptionInit extends StObject {
  
  var sdp: js.UndefOr[java.lang.String] = js.native
  
  var `type`: js.UndefOr[RTCSdpType] = js.native
}
object RTCLocalSessionDescriptionInit {
  
  @scala.inline
  def apply(sdp: java.lang.String = null, `type`: RTCSdpType = null): RTCLocalSessionDescriptionInit = {
    val __obj = js.Dynamic.literal()
    if (sdp != null) __obj.updateDynamic("sdp")(sdp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCLocalSessionDescriptionInit]
  }
}
