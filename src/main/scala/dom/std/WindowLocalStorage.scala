package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowLocalStorage extends StObject {
  
  val localStorage: Storage = js.native
}
object WindowLocalStorage {
  
  @scala.inline
  def apply(localStorage: Storage): WindowLocalStorage = {
    val __obj = js.Dynamic.literal(localStorage = localStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowLocalStorage]
  }
}
