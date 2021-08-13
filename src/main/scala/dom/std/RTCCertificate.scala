package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCCertificate extends StObject {
  
  val expires: Double = js.native
  
  def getFingerprints(): js.Array[RTCDtlsFingerprint] = js.native
}
object RTCCertificate {
  
  @scala.inline
  def apply(expires: Double, getFingerprints: () => js.Array[RTCDtlsFingerprint]): RTCCertificate = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], getFingerprints = js.Any.fromFunction0(getFingerprints))
    __obj.asInstanceOf[RTCCertificate]
  }
}
