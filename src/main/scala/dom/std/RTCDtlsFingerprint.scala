package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDtlsFingerprint extends StObject {
  
  var algorithm: js.UndefOr[java.lang.String] = js.native
  
  var value: js.UndefOr[java.lang.String] = js.native
}
object RTCDtlsFingerprint {
  
  @scala.inline
  def apply(algorithm: java.lang.String = null, value: java.lang.String = null): RTCDtlsFingerprint = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtlsFingerprint]
  }
}
