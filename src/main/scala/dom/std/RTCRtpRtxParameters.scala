package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpRtxParameters extends StObject {
  
  var ssrc: js.UndefOr[Double] = js.native
}
object RTCRtpRtxParameters {
  
  @scala.inline
  def apply(ssrc: js.UndefOr[Double] = js.undefined): RTCRtpRtxParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ssrc)) __obj.updateDynamic("ssrc")(ssrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpRtxParameters]
  }
}
