package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpEncodingParameters
  extends StObject
     with RTCRtpCodingParameters {
  
  var active: js.UndefOr[scala.Boolean] = js.native
  
  var maxBitrate: js.UndefOr[Double] = js.native
  
  var scaleResolutionDownBy: js.UndefOr[Double] = js.native
}
object RTCRtpEncodingParameters {
  
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    maxBitrate: js.UndefOr[Double] = js.undefined,
    rid: java.lang.String = null,
    scaleResolutionDownBy: js.UndefOr[Double] = js.undefined
  ): RTCRtpEncodingParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBitrate)) __obj.updateDynamic("maxBitrate")(maxBitrate.asInstanceOf[js.Any])
    if (rid != null) __obj.updateDynamic("rid")(rid.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleResolutionDownBy)) __obj.updateDynamic("scaleResolutionDownBy")(scaleResolutionDownBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpEncodingParameters]
  }
}
