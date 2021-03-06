package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An error which occurred while handling media in an HTML media element based on HTMLMediaElement, such as <audio> or <video>. */
@js.native
trait MediaError extends StObject {
  
  val MEDIA_ERR_ABORTED: Double = js.native
  
  val MEDIA_ERR_DECODE: Double = js.native
  
  val MEDIA_ERR_NETWORK: Double = js.native
  
  val MEDIA_ERR_SRC_NOT_SUPPORTED: Double = js.native
  
  val code: Double = js.native
  
  val message: java.lang.String = js.native
}
object MediaError {
  
  @scala.inline
  def apply(
    MEDIA_ERR_ABORTED: Double,
    MEDIA_ERR_DECODE: Double,
    MEDIA_ERR_NETWORK: Double,
    MEDIA_ERR_SRC_NOT_SUPPORTED: Double,
    code: Double,
    message: java.lang.String
  ): MediaError = {
    val __obj = js.Dynamic.literal(MEDIA_ERR_ABORTED = MEDIA_ERR_ABORTED.asInstanceOf[js.Any], MEDIA_ERR_DECODE = MEDIA_ERR_DECODE.asInstanceOf[js.Any], MEDIA_ERR_NETWORK = MEDIA_ERR_NETWORK.asInstanceOf[js.Any], MEDIA_ERR_SRC_NOT_SUPPORTED = MEDIA_ERR_SRC_NOT_SUPPORTED.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaError]
  }
}
