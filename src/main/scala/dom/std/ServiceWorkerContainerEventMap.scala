package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerContainerEventMap extends StObject {
  
  var controllerchange: Event = js.native
  
  var message: MessageEvent[js.Any] = js.native
  
  var messageerror: MessageEvent[js.Any] = js.native
}
object ServiceWorkerContainerEventMap {
  
  @scala.inline
  def apply(controllerchange: Event, message: MessageEvent[js.Any], messageerror: MessageEvent[js.Any]): ServiceWorkerContainerEventMap = {
    val __obj = js.Dynamic.literal(controllerchange = controllerchange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerContainerEventMap]
  }
}
