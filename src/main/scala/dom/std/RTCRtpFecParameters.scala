package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpFecParameters extends StObject {
  
  var mechanism: js.UndefOr[java.lang.String] = js.native
  
  var ssrc: js.UndefOr[Double] = js.native
}
object RTCRtpFecParameters {
  
  @scala.inline
  def apply(mechanism: java.lang.String = null, ssrc: js.UndefOr[Double] = js.undefined): RTCRtpFecParameters = {
    val __obj = js.Dynamic.literal()
    if (mechanism != null) __obj.updateDynamic("mechanism")(mechanism.asInstanceOf[js.Any])
    if (!js.isUndefined(ssrc)) __obj.updateDynamic("ssrc")(ssrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpFecParameters]
  }
}
