package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpTransceiverInit extends StObject {
  
  var direction: js.UndefOr[RTCRtpTransceiverDirection] = js.native
  
  var sendEncodings: js.UndefOr[js.Array[RTCRtpEncodingParameters]] = js.native
  
  var streams: js.UndefOr[js.Array[MediaStream]] = js.native
}
object RTCRtpTransceiverInit {
  
  @scala.inline
  def apply(
    direction: RTCRtpTransceiverDirection = null,
    sendEncodings: js.Array[RTCRtpEncodingParameters] = null,
    streams: js.Array[MediaStream] = null
  ): RTCRtpTransceiverInit = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (sendEncodings != null) __obj.updateDynamic("sendEncodings")(sendEncodings.asInstanceOf[js.Any])
    if (streams != null) __obj.updateDynamic("streams")(streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpTransceiverInit]
  }
}
