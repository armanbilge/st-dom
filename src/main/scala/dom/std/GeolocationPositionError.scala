package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeolocationPositionError extends StObject {
  
  val PERMISSION_DENIED: Double = js.native
  
  val POSITION_UNAVAILABLE: Double = js.native
  
  val TIMEOUT: Double = js.native
  
  val code: Double = js.native
  
  val message: java.lang.String = js.native
}
object GeolocationPositionError {
  
  @scala.inline
  def apply(
    PERMISSION_DENIED: Double,
    POSITION_UNAVAILABLE: Double,
    TIMEOUT: Double,
    code: Double,
    message: java.lang.String
  ): GeolocationPositionError = {
    val __obj = js.Dynamic.literal(PERMISSION_DENIED = PERMISSION_DENIED.asInstanceOf[js.Any], POSITION_UNAVAILABLE = POSITION_UNAVAILABLE.asInstanceOf[js.Any], TIMEOUT = TIMEOUT.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationPositionError]
  }
}
