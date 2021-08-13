package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The RTCIceCandidate interface—part of the WebRTC API—represents a candidate Internet Connectivity Establishment (ICE) configuration which may be used to establish an RTCPeerConnection. */
@js.native
trait RTCIceCandidate extends StObject {
  
  val candidate: java.lang.String = js.native
  
  val component: RTCIceComponent | Null = js.native
  
  val foundation: java.lang.String | Null = js.native
  
  val port: Double | Null = js.native
  
  val priority: Double | Null = js.native
  
  val protocol: RTCIceProtocol | Null = js.native
  
  val relatedAddress: java.lang.String | Null = js.native
  
  val relatedPort: Double | Null = js.native
  
  val sdpMLineIndex: Double | Null = js.native
  
  val sdpMid: java.lang.String | Null = js.native
  
  val tcpType: RTCIceTcpCandidateType | Null = js.native
  
  def toJSON(): RTCIceCandidateInit = js.native
  
  val `type`: RTCIceCandidateType | Null = js.native
  
  val usernameFragment: java.lang.String | Null = js.native
}
object RTCIceCandidate {
  
  @scala.inline
  def apply(
    candidate: java.lang.String,
    toJSON: () => RTCIceCandidateInit,
    component: RTCIceComponent = null,
    foundation: java.lang.String = null,
    port: Double = null.asInstanceOf[Double],
    priority: Double = null.asInstanceOf[Double],
    protocol: RTCIceProtocol = null,
    relatedAddress: java.lang.String = null,
    relatedPort: Double = null.asInstanceOf[Double],
    sdpMLineIndex: Double = null.asInstanceOf[Double],
    sdpMid: java.lang.String = null,
    tcpType: RTCIceTcpCandidateType = null,
    `type`: RTCIceCandidateType = null,
    usernameFragment: java.lang.String = null
  ): RTCIceCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("component")(if (component != null) component.asInstanceOf[RTCIceComponent].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("foundation")(if (foundation != null) foundation.asInstanceOf[java.lang.String].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("port")(if (port != null) port.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("priority")(if (priority != null) priority.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("protocol")(if (protocol != null) protocol.asInstanceOf[RTCIceProtocol].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("relatedAddress")(if (relatedAddress != null) relatedAddress.asInstanceOf[java.lang.String].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("relatedPort")(if (relatedPort != null) relatedPort.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("sdpMLineIndex")(if (sdpMLineIndex != null) sdpMLineIndex.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("sdpMid")(if (sdpMid != null) sdpMid.asInstanceOf[java.lang.String].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("tcpType")(if (tcpType != null) tcpType.asInstanceOf[RTCIceTcpCandidateType].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("type")(if (`type` != null) `type`.asInstanceOf[RTCIceCandidateType].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("usernameFragment")(if (usernameFragment != null) usernameFragment.asInstanceOf[java.lang.String].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[RTCIceCandidate]
  }
}
