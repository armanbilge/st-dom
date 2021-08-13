package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceCandidateAttributes
  extends StObject
     with RTCStats {
  
  var addressSourceUrl: js.UndefOr[java.lang.String] = js.native
  
  var candidateType: js.UndefOr[RTCStatsIceCandidateType] = js.native
  
  var ipAddress: js.UndefOr[java.lang.String] = js.native
  
  var portNumber: js.UndefOr[Double] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var transport: js.UndefOr[java.lang.String] = js.native
}
object RTCIceCandidateAttributes {
  
  @scala.inline
  def apply(
    addressSourceUrl: java.lang.String = null,
    candidateType: RTCStatsIceCandidateType = null,
    id: java.lang.String = null,
    ipAddress: java.lang.String = null,
    portNumber: js.UndefOr[Double] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    timestamp: js.UndefOr[Double] = js.undefined,
    transport: java.lang.String = null,
    `type`: RTCStatsType = null
  ): RTCIceCandidateAttributes = {
    val __obj = js.Dynamic.literal()
    if (addressSourceUrl != null) __obj.updateDynamic("addressSourceUrl")(addressSourceUrl.asInstanceOf[js.Any])
    if (candidateType != null) __obj.updateDynamic("candidateType")(candidateType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(portNumber)) __obj.updateDynamic("portNumber")(portNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidateAttributes]
  }
}
