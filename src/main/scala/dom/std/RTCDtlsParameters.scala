package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDtlsParameters extends StObject {
  
  var fingerprints: js.UndefOr[js.Array[RTCDtlsFingerprint]] = js.native
  
  var role: js.UndefOr[RTCDtlsRole] = js.native
}
object RTCDtlsParameters {
  
  @scala.inline
  def apply(fingerprints: js.Array[RTCDtlsFingerprint] = null, role: RTCDtlsRole = null): RTCDtlsParameters = {
    val __obj = js.Dynamic.literal()
    if (fingerprints != null) __obj.updateDynamic("fingerprints")(fingerprints.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtlsParameters]
  }
}
