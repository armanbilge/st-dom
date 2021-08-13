package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtcpFeedback extends StObject {
  
  var parameter: js.UndefOr[java.lang.String] = js.native
  
  var `type`: js.UndefOr[java.lang.String] = js.native
}
object RTCRtcpFeedback {
  
  @scala.inline
  def apply(parameter: java.lang.String = null, `type`: java.lang.String = null): RTCRtcpFeedback = {
    val __obj = js.Dynamic.literal()
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtcpFeedback]
  }
}
