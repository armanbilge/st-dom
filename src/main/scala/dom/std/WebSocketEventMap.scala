package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketEventMap extends StObject {
  
  var close: CloseEvent = js.native
  
  var error: Event = js.native
  
  var message: MessageEvent[js.Any] = js.native
  
  var open: Event = js.native
}
object WebSocketEventMap {
  
  @scala.inline
  def apply(close: CloseEvent, error: Event, message: MessageEvent[js.Any], open: Event): WebSocketEventMap = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketEventMap]
  }
}
