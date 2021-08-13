package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCConfiguration extends StObject {
  
  var bundlePolicy: js.UndefOr[RTCBundlePolicy] = js.native
  
  var certificates: js.UndefOr[js.Array[RTCCertificate]] = js.native
  
  var iceCandidatePoolSize: js.UndefOr[Double] = js.native
  
  var iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.native
  
  var iceTransportPolicy: js.UndefOr[RTCIceTransportPolicy] = js.native
  
  var rtcpMuxPolicy: js.UndefOr[RTCRtcpMuxPolicy] = js.native
}
object RTCConfiguration {
  
  @scala.inline
  def apply(
    bundlePolicy: RTCBundlePolicy = null,
    certificates: js.Array[RTCCertificate] = null,
    iceCandidatePoolSize: js.UndefOr[Double] = js.undefined,
    iceServers: js.Array[RTCIceServer] = null,
    iceTransportPolicy: RTCIceTransportPolicy = null,
    rtcpMuxPolicy: RTCRtcpMuxPolicy = null
  ): RTCConfiguration = {
    val __obj = js.Dynamic.literal()
    if (bundlePolicy != null) __obj.updateDynamic("bundlePolicy")(bundlePolicy.asInstanceOf[js.Any])
    if (certificates != null) __obj.updateDynamic("certificates")(certificates.asInstanceOf[js.Any])
    if (!js.isUndefined(iceCandidatePoolSize)) __obj.updateDynamic("iceCandidatePoolSize")(iceCandidatePoolSize.asInstanceOf[js.Any])
    if (iceServers != null) __obj.updateDynamic("iceServers")(iceServers.asInstanceOf[js.Any])
    if (iceTransportPolicy != null) __obj.updateDynamic("iceTransportPolicy")(iceTransportPolicy.asInstanceOf[js.Any])
    if (rtcpMuxPolicy != null) __obj.updateDynamic("rtcpMuxPolicy")(rtcpMuxPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCConfiguration]
  }
}
