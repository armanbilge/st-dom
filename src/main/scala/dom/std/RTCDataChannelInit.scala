package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDataChannelInit extends StObject {
  
  var id: js.UndefOr[Double] = js.native
  
  var maxPacketLifeTime: js.UndefOr[Double] = js.native
  
  var maxRetransmits: js.UndefOr[Double] = js.native
  
  var negotiated: js.UndefOr[scala.Boolean] = js.native
  
  var ordered: js.UndefOr[scala.Boolean] = js.native
  
  var protocol: js.UndefOr[java.lang.String] = js.native
}
object RTCDataChannelInit {
  
  @scala.inline
  def apply(
    id: js.UndefOr[Double] = js.undefined,
    maxPacketLifeTime: js.UndefOr[Double] = js.undefined,
    maxRetransmits: js.UndefOr[Double] = js.undefined,
    negotiated: js.UndefOr[scala.Boolean] = js.undefined,
    ordered: js.UndefOr[scala.Boolean] = js.undefined,
    protocol: java.lang.String = null
  ): RTCDataChannelInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPacketLifeTime)) __obj.updateDynamic("maxPacketLifeTime")(maxPacketLifeTime.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetransmits)) __obj.updateDynamic("maxRetransmits")(maxRetransmits.asInstanceOf[js.Any])
    if (!js.isUndefined(negotiated)) __obj.updateDynamic("negotiated")(negotiated.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelInit]
  }
}
