package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpHeaderExtensionCapability extends StObject {
  
  var uri: js.UndefOr[java.lang.String] = js.native
}
object RTCRtpHeaderExtensionCapability {
  
  @scala.inline
  def apply(uri: java.lang.String = null): RTCRtpHeaderExtensionCapability = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpHeaderExtensionCapability]
  }
}
