package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostMessageOptions extends StObject {
  
  var transfer: js.UndefOr[js.Array[js.Any]] = js.native
}
object PostMessageOptions {
  
  @scala.inline
  def apply(transfer: js.Array[js.Any] = null): PostMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (transfer != null) __obj.updateDynamic("transfer")(transfer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostMessageOptions]
  }
}
