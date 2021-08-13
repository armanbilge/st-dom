package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDataChannelEventMap extends StObject {
  
  var bufferedamountlow: Event = js.native
  
  var close: Event = js.native
  
  var error: RTCErrorEvent = js.native
  
  var message: MessageEvent[js.Any] = js.native
  
  var open: Event = js.native
}
object RTCDataChannelEventMap {
  
  @scala.inline
  def apply(
    bufferedamountlow: Event,
    close: Event,
    error: RTCErrorEvent,
    message: MessageEvent[js.Any],
    open: Event
  ): RTCDataChannelEventMap = {
    val __obj = js.Dynamic.literal(bufferedamountlow = bufferedamountlow.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEventMap]
  }
}
