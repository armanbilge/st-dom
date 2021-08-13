package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpUnhandled extends StObject {
  
  var muxId: js.UndefOr[java.lang.String] = js.native
  
  var payloadType: js.UndefOr[Double] = js.native
  
  var ssrc: js.UndefOr[Double] = js.native
}
object RTCRtpUnhandled {
  
  @scala.inline
  def apply(
    muxId: java.lang.String = null,
    payloadType: js.UndefOr[Double] = js.undefined,
    ssrc: js.UndefOr[Double] = js.undefined
  ): RTCRtpUnhandled = {
    val __obj = js.Dynamic.literal()
    if (muxId != null) __obj.updateDynamic("muxId")(muxId.asInstanceOf[js.Any])
    if (!js.isUndefined(payloadType)) __obj.updateDynamic("payloadType")(payloadType.asInstanceOf[js.Any])
    if (!js.isUndefined(ssrc)) __obj.updateDynamic("ssrc")(ssrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpUnhandled]
  }
}
