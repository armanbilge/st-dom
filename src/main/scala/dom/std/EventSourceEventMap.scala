package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSourceEventMap extends StObject {
  
  var error: Event = js.native
  
  var message: MessageEvent[js.Any] = js.native
  
  var open: Event = js.native
}
object EventSourceEventMap {
  
  @scala.inline
  def apply(error: Event, message: MessageEvent[js.Any], open: Event): EventSourceEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceEventMap]
  }
}
