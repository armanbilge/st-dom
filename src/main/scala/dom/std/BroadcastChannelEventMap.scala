package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadcastChannelEventMap extends StObject {
  
  var message: MessageEvent[js.Any] = js.native
  
  var messageerror: MessageEvent[js.Any] = js.native
}
object BroadcastChannelEventMap {
  
  @scala.inline
  def apply(message: MessageEvent[js.Any], messageerror: MessageEvent[js.Any]): BroadcastChannelEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastChannelEventMap]
  }
}
