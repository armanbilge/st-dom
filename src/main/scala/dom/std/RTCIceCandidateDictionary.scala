package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceCandidateDictionary
  extends StObject
     with RTCIceGatherCandidate {
  
  var foundation: js.UndefOr[java.lang.String] = js.native
  
  var ip: js.UndefOr[java.lang.String] = js.native
  
  var msMTurnSessionId: js.UndefOr[java.lang.String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var protocol: js.UndefOr[RTCIceProtocol] = js.native
  
  var relatedAddress: js.UndefOr[java.lang.String] = js.native
  
  var relatedPort: js.UndefOr[Double] = js.native
  
  var tcpType: js.UndefOr[RTCIceTcpCandidateType] = js.native
  
  var `type`: js.UndefOr[RTCIceCandidateType] = js.native
}
object RTCIceCandidateDictionary {
  
  @scala.inline
  def apply(
    foundation: java.lang.String = null,
    ip: java.lang.String = null,
    msMTurnSessionId: java.lang.String = null,
    port: js.UndefOr[Double] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    protocol: RTCIceProtocol = null,
    relatedAddress: java.lang.String = null,
    relatedPort: js.UndefOr[Double] = js.undefined,
    tcpType: RTCIceTcpCandidateType = null,
    `type`: RTCIceCandidateType = null
  ): RTCIceCandidateDictionary = {
    val __obj = js.Dynamic.literal()
    if (foundation != null) __obj.updateDynamic("foundation")(foundation.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (msMTurnSessionId != null) __obj.updateDynamic("msMTurnSessionId")(msMTurnSessionId.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (relatedAddress != null) __obj.updateDynamic("relatedAddress")(relatedAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(relatedPort)) __obj.updateDynamic("relatedPort")(relatedPort.asInstanceOf[js.Any])
    if (tcpType != null) __obj.updateDynamic("tcpType")(tcpType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidateDictionary]
  }
}
