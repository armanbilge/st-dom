package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBOpenDBRequestEventMap
  extends StObject
     with IDBRequestEventMap {
  
  var blocked: Event = js.native
  
  var upgradeneeded: IDBVersionChangeEvent = js.native
}
object IDBOpenDBRequestEventMap {
  
  @scala.inline
  def apply(blocked: Event, error: Event, success: Event, upgradeneeded: IDBVersionChangeEvent): IDBOpenDBRequestEventMap = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], upgradeneeded = upgradeneeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBOpenDBRequestEventMap]
  }
}
