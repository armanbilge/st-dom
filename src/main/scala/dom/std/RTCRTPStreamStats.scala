package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRTPStreamStats
  extends StObject
     with RTCStats {
  
  var associateStatsId: js.UndefOr[java.lang.String] = js.native
  
  var codecId: js.UndefOr[java.lang.String] = js.native
  
  var firCount: js.UndefOr[Double] = js.native
  
  var isRemote: js.UndefOr[scala.Boolean] = js.native
  
  var mediaTrackId: js.UndefOr[java.lang.String] = js.native
  
  var mediaType: js.UndefOr[java.lang.String] = js.native
  
  var nackCount: js.UndefOr[Double] = js.native
  
  var pliCount: js.UndefOr[Double] = js.native
  
  var sliCount: js.UndefOr[Double] = js.native
  
  var ssrc: js.UndefOr[java.lang.String] = js.native
  
  var transportId: js.UndefOr[java.lang.String] = js.native
}
object RTCRTPStreamStats {
  
  @scala.inline
  def apply(
    associateStatsId: java.lang.String = null,
    codecId: java.lang.String = null,
    firCount: js.UndefOr[Double] = js.undefined,
    id: java.lang.String = null,
    isRemote: js.UndefOr[scala.Boolean] = js.undefined,
    mediaTrackId: java.lang.String = null,
    mediaType: java.lang.String = null,
    nackCount: js.UndefOr[Double] = js.undefined,
    pliCount: js.UndefOr[Double] = js.undefined,
    sliCount: js.UndefOr[Double] = js.undefined,
    ssrc: java.lang.String = null,
    timestamp: js.UndefOr[Double] = js.undefined,
    transportId: java.lang.String = null,
    `type`: RTCStatsType = null
  ): RTCRTPStreamStats = {
    val __obj = js.Dynamic.literal()
    if (associateStatsId != null) __obj.updateDynamic("associateStatsId")(associateStatsId.asInstanceOf[js.Any])
    if (codecId != null) __obj.updateDynamic("codecId")(codecId.asInstanceOf[js.Any])
    if (!js.isUndefined(firCount)) __obj.updateDynamic("firCount")(firCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isRemote)) __obj.updateDynamic("isRemote")(isRemote.asInstanceOf[js.Any])
    if (mediaTrackId != null) __obj.updateDynamic("mediaTrackId")(mediaTrackId.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (!js.isUndefined(nackCount)) __obj.updateDynamic("nackCount")(nackCount.asInstanceOf[js.Any])
    if (!js.isUndefined(pliCount)) __obj.updateDynamic("pliCount")(pliCount.asInstanceOf[js.Any])
    if (!js.isUndefined(sliCount)) __obj.updateDynamic("sliCount")(sliCount.asInstanceOf[js.Any])
    if (ssrc != null) __obj.updateDynamic("ssrc")(ssrc.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (transportId != null) __obj.updateDynamic("transportId")(transportId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRTPStreamStats]
  }
}
