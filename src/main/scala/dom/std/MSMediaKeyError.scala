package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSMediaKeyError extends StObject {
  
  val MS_MEDIA_KEYERR_CLIENT: Double = js.native
  
  val MS_MEDIA_KEYERR_DOMAIN: Double = js.native
  
  val MS_MEDIA_KEYERR_HARDWARECHANGE: Double = js.native
  
  val MS_MEDIA_KEYERR_OUTPUT: Double = js.native
  
  val MS_MEDIA_KEYERR_SERVICE: Double = js.native
  
  val MS_MEDIA_KEYERR_UNKNOWN: Double = js.native
  
  val code: Double = js.native
  
  val systemCode: Double = js.native
}
object MSMediaKeyError {
  
  @scala.inline
  def apply(
    MS_MEDIA_KEYERR_CLIENT: Double,
    MS_MEDIA_KEYERR_DOMAIN: Double,
    MS_MEDIA_KEYERR_HARDWARECHANGE: Double,
    MS_MEDIA_KEYERR_OUTPUT: Double,
    MS_MEDIA_KEYERR_SERVICE: Double,
    MS_MEDIA_KEYERR_UNKNOWN: Double,
    code: Double,
    systemCode: Double
  ): MSMediaKeyError = {
    val __obj = js.Dynamic.literal(MS_MEDIA_KEYERR_CLIENT = MS_MEDIA_KEYERR_CLIENT.asInstanceOf[js.Any], MS_MEDIA_KEYERR_DOMAIN = MS_MEDIA_KEYERR_DOMAIN.asInstanceOf[js.Any], MS_MEDIA_KEYERR_HARDWARECHANGE = MS_MEDIA_KEYERR_HARDWARECHANGE.asInstanceOf[js.Any], MS_MEDIA_KEYERR_OUTPUT = MS_MEDIA_KEYERR_OUTPUT.asInstanceOf[js.Any], MS_MEDIA_KEYERR_SERVICE = MS_MEDIA_KEYERR_SERVICE.asInstanceOf[js.Any], MS_MEDIA_KEYERR_UNKNOWN = MS_MEDIA_KEYERR_UNKNOWN.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], systemCode = systemCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSMediaKeyError]
  }
}
