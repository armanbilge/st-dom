package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCCertificateExpiration extends StObject {
  
  var expires: js.UndefOr[Double] = js.native
}
object RTCCertificateExpiration {
  
  @scala.inline
  def apply(expires: js.UndefOr[Double] = js.undefined): RTCCertificateExpiration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCCertificateExpiration]
  }
}
