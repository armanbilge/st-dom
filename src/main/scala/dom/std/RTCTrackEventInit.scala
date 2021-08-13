package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCTrackEventInit
  extends StObject
     with EventInit {
  
  var receiver: RTCRtpReceiver = js.native
  
  var streams: js.UndefOr[js.Array[MediaStream]] = js.native
  
  var track: MediaStreamTrack = js.native
  
  var transceiver: RTCRtpTransceiver = js.native
}
object RTCTrackEventInit {
  
  @scala.inline
  def apply(
    receiver: RTCRtpReceiver,
    track: MediaStreamTrack,
    transceiver: RTCRtpTransceiver,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    streams: js.Array[MediaStream] = null
  ): RTCTrackEventInit = {
    val __obj = js.Dynamic.literal(receiver = receiver.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], transceiver = transceiver.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (streams != null) __obj.updateDynamic("streams")(streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTrackEventInit]
  }
}
