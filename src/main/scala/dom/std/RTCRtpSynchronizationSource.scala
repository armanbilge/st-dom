package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpSynchronizationSource
  extends StObject
     with RTCRtpContributingSource {
  
  var voiceActivityFlag: js.UndefOr[scala.Boolean] = js.native
}
object RTCRtpSynchronizationSource {
  
  @scala.inline
  def apply(
    rtpTimestamp: Double,
    source: Double,
    timestamp: Double,
    audioLevel: js.UndefOr[Double] = js.undefined,
    voiceActivityFlag: js.UndefOr[scala.Boolean] = js.undefined
  ): RTCRtpSynchronizationSource = {
    val __obj = js.Dynamic.literal(rtpTimestamp = rtpTimestamp.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(audioLevel)) __obj.updateDynamic("audioLevel")(audioLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceActivityFlag)) __obj.updateDynamic("voiceActivityFlag")(voiceActivityFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpSynchronizationSource]
  }
}
