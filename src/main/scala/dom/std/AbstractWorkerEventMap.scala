package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractWorkerEventMap extends StObject {
  
  var error: ErrorEvent = js.native
}
object AbstractWorkerEventMap {
  
  @scala.inline
  def apply(error: ErrorEvent): AbstractWorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractWorkerEventMap]
  }
}
