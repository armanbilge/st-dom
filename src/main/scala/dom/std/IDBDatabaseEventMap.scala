package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBDatabaseEventMap extends StObject {
  
  var abort: Event = js.native
  
  var close: Event = js.native
  
  var error: Event = js.native
  
  var versionchange: IDBVersionChangeEvent = js.native
}
object IDBDatabaseEventMap {
  
  @scala.inline
  def apply(abort: Event, close: Event, error: Event, versionchange: IDBVersionChangeEvent): IDBDatabaseEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], versionchange = versionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBDatabaseEventMap]
  }
}
