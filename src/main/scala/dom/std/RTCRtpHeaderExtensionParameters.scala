package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpHeaderExtensionParameters extends StObject {
  
  var encrypted: js.UndefOr[scala.Boolean] = js.native
  
  var id: Double = js.native
  
  var uri: java.lang.String = js.native
}
object RTCRtpHeaderExtensionParameters {
  
  @scala.inline
  def apply(id: Double, uri: java.lang.String, encrypted: js.UndefOr[scala.Boolean] = js.undefined): RTCRtpHeaderExtensionParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpHeaderExtensionParameters]
  }
}
