package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpCodingParameters extends StObject {
  
  var rid: js.UndefOr[java.lang.String] = js.native
}
object RTCRtpCodingParameters {
  
  @scala.inline
  def apply(rid: java.lang.String = null): RTCRtpCodingParameters = {
    val __obj = js.Dynamic.literal()
    if (rid != null) __obj.updateDynamic("rid")(rid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodingParameters]
  }
}
