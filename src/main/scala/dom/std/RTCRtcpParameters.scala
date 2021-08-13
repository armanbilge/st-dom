package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtcpParameters extends StObject {
  
  var cname: js.UndefOr[java.lang.String] = js.native
  
  var reducedSize: js.UndefOr[scala.Boolean] = js.native
}
object RTCRtcpParameters {
  
  @scala.inline
  def apply(cname: java.lang.String = null, reducedSize: js.UndefOr[scala.Boolean] = js.undefined): RTCRtcpParameters = {
    val __obj = js.Dynamic.literal()
    if (cname != null) __obj.updateDynamic("cname")(cname.asInstanceOf[js.Any])
    if (!js.isUndefined(reducedSize)) __obj.updateDynamic("reducedSize")(reducedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtcpParameters]
  }
}
