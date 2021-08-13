package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCOutboundRTPStreamStats
  extends StObject
     with RTCRTPStreamStats {
  
  var bytesSent: js.UndefOr[Double] = js.native
  
  var packetsSent: js.UndefOr[Double] = js.native
  
  var roundTripTime: js.UndefOr[Double] = js.native
  
  var targetBitrate: js.UndefOr[Double] = js.native
}
object RTCOutboundRTPStreamStats {
  
  @scala.inline
  def apply(
    associateStatsId: java.lang.String = null,
    bytesSent: js.UndefOr[Double] = js.undefined,
    codecId: java.lang.String = null,
    firCount: js.UndefOr[Double] = js.undefined,
    id: java.lang.String = null,
    isRemote: js.UndefOr[scala.Boolean] = js.undefined,
    mediaTrackId: java.lang.String = null,
    mediaType: java.lang.String = null,
    nackCount: js.UndefOr[Double] = js.undefined,
    packetsSent: js.UndefOr[Double] = js.undefined,
    pliCount: js.UndefOr[Double] = js.undefined,
    roundTripTime: js.UndefOr[Double] = js.undefined,
    sliCount: js.UndefOr[Double] = js.undefined,
    ssrc: java.lang.String = null,
    targetBitrate: js.UndefOr[Double] = js.undefined,
    timestamp: js.UndefOr[Double] = js.undefined,
    transportId: java.lang.String = null,
    `type`: RTCStatsType = null
  ): RTCOutboundRTPStreamStats = {
    val __obj = js.Dynamic.literal()
    if (associateStatsId != null) __obj.updateDynamic("associateStatsId")(associateStatsId.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesSent)) __obj.updateDynamic("bytesSent")(bytesSent.asInstanceOf[js.Any])
    if (codecId != null) __obj.updateDynamic("codecId")(codecId.asInstanceOf[js.Any])
    if (!js.isUndefined(firCount)) __obj.updateDynamic("firCount")(firCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isRemote)) __obj.updateDynamic("isRemote")(isRemote.asInstanceOf[js.Any])
    if (mediaTrackId != null) __obj.updateDynamic("mediaTrackId")(mediaTrackId.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (!js.isUndefined(nackCount)) __obj.updateDynamic("nackCount")(nackCount.asInstanceOf[js.Any])
    if (!js.isUndefined(packetsSent)) __obj.updateDynamic("packetsSent")(packetsSent.asInstanceOf[js.Any])
    if (!js.isUndefined(pliCount)) __obj.updateDynamic("pliCount")(pliCount.asInstanceOf[js.Any])
    if (!js.isUndefined(roundTripTime)) __obj.updateDynamic("roundTripTime")(roundTripTime.asInstanceOf[js.Any])
    if (!js.isUndefined(sliCount)) __obj.updateDynamic("sliCount")(sliCount.asInstanceOf[js.Any])
    if (ssrc != null) __obj.updateDynamic("ssrc")(ssrc.asInstanceOf[js.Any])
    if (!js.isUndefined(targetBitrate)) __obj.updateDynamic("targetBitrate")(targetBitrate.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (transportId != null) __obj.updateDynamic("transportId")(transportId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOutboundRTPStreamStats]
  }
}
