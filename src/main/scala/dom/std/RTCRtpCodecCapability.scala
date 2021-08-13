package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpCodecCapability extends StObject {
  
  var channels: js.UndefOr[Double] = js.native
  
  var clockRate: Double = js.native
  
  var mimeType: java.lang.String = js.native
  
  var sdpFmtpLine: js.UndefOr[java.lang.String] = js.native
}
object RTCRtpCodecCapability {
  
  @scala.inline
  def apply(
    clockRate: Double,
    mimeType: java.lang.String,
    channels: js.UndefOr[Double] = js.undefined,
    sdpFmtpLine: java.lang.String = null
  ): RTCRtpCodecCapability = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(channels)) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (sdpFmtpLine != null) __obj.updateDynamic("sdpFmtpLine")(sdpFmtpLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodecCapability]
  }
}
