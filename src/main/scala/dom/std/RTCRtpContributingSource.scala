package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpContributingSource extends StObject {
  
  var audioLevel: js.UndefOr[Double] = js.native
  
  var rtpTimestamp: Double = js.native
  
  var source: Double = js.native
  
  var timestamp: Double = js.native
}
object RTCRtpContributingSource {
  
  @scala.inline
  def apply(
    rtpTimestamp: Double,
    source: Double,
    timestamp: Double,
    audioLevel: js.UndefOr[Double] = js.undefined
  ): RTCRtpContributingSource = {
    val __obj = js.Dynamic.literal(rtpTimestamp = rtpTimestamp.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(audioLevel)) __obj.updateDynamic("audioLevel")(audioLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpContributingSource]
  }
}
