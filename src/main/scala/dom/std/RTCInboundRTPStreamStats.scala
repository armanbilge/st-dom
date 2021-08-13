package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCInboundRTPStreamStats
  extends StObject
     with RTCRTPStreamStats {
  
  var bytesReceived: js.UndefOr[Double] = js.native
  
  var fractionLost: js.UndefOr[Double] = js.native
  
  var jitter: js.UndefOr[Double] = js.native
  
  var packetsLost: js.UndefOr[Double] = js.native
  
  var packetsReceived: js.UndefOr[Double] = js.native
}
object RTCInboundRTPStreamStats {
  
  @scala.inline
  def apply(
    associateStatsId: java.lang.String = null,
    bytesReceived: js.UndefOr[Double] = js.undefined,
    codecId: java.lang.String = null,
    firCount: js.UndefOr[Double] = js.undefined,
    fractionLost: js.UndefOr[Double] = js.undefined,
    id: java.lang.String = null,
    isRemote: js.UndefOr[scala.Boolean] = js.undefined,
    jitter: js.UndefOr[Double] = js.undefined,
    mediaTrackId: java.lang.String = null,
    mediaType: java.lang.String = null,
    nackCount: js.UndefOr[Double] = js.undefined,
    packetsLost: js.UndefOr[Double] = js.undefined,
    packetsReceived: js.UndefOr[Double] = js.undefined,
    pliCount: js.UndefOr[Double] = js.undefined,
    sliCount: js.UndefOr[Double] = js.undefined,
    ssrc: java.lang.String = null,
    timestamp: js.UndefOr[Double] = js.undefined,
    transportId: java.lang.String = null,
    `type`: RTCStatsType = null
  ): RTCInboundRTPStreamStats = {
    val __obj = js.Dynamic.literal()
    if (associateStatsId != null) __obj.updateDynamic("associateStatsId")(associateStatsId.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesReceived)) __obj.updateDynamic("bytesReceived")(bytesReceived.asInstanceOf[js.Any])
    if (codecId != null) __obj.updateDynamic("codecId")(codecId.asInstanceOf[js.Any])
    if (!js.isUndefined(firCount)) __obj.updateDynamic("firCount")(firCount.asInstanceOf[js.Any])
    if (!js.isUndefined(fractionLost)) __obj.updateDynamic("fractionLost")(fractionLost.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isRemote)) __obj.updateDynamic("isRemote")(isRemote.asInstanceOf[js.Any])
    if (!js.isUndefined(jitter)) __obj.updateDynamic("jitter")(jitter.asInstanceOf[js.Any])
    if (mediaTrackId != null) __obj.updateDynamic("mediaTrackId")(mediaTrackId.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (!js.isUndefined(nackCount)) __obj.updateDynamic("nackCount")(nackCount.asInstanceOf[js.Any])
    if (!js.isUndefined(packetsLost)) __obj.updateDynamic("packetsLost")(packetsLost.asInstanceOf[js.Any])
    if (!js.isUndefined(packetsReceived)) __obj.updateDynamic("packetsReceived")(packetsReceived.asInstanceOf[js.Any])
    if (!js.isUndefined(pliCount)) __obj.updateDynamic("pliCount")(pliCount.asInstanceOf[js.Any])
    if (!js.isUndefined(sliCount)) __obj.updateDynamic("sliCount")(sliCount.asInstanceOf[js.Any])
    if (ssrc != null) __obj.updateDynamic("ssrc")(ssrc.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (transportId != null) __obj.updateDynamic("transportId")(transportId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCInboundRTPStreamStats]
  }
}
