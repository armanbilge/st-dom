package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePortEventMap extends StObject {
  
  var message: MessageEvent[js.Any] = js.native
  
  var messageerror: MessageEvent[js.Any] = js.native
}
object MessagePortEventMap {
  
  @scala.inline
  def apply(message: MessageEvent[js.Any], messageerror: MessageEvent[js.Any]): MessagePortEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePortEventMap]
  }
}
