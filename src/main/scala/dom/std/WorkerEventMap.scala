package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerEventMap
  extends StObject
     with AbstractWorkerEventMap {
  
  var message: MessageEvent[js.Any] = js.native
  
  var messageerror: MessageEvent[js.Any] = js.native
}
object WorkerEventMap {
  
  @scala.inline
  def apply(error: ErrorEvent, message: MessageEvent[js.Any], messageerror: MessageEvent[js.Any]): WorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerEventMap]
  }
}
