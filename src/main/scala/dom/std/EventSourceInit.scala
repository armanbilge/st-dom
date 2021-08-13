package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSourceInit extends StObject {
  
  var withCredentials: js.UndefOr[scala.Boolean] = js.native
}
object EventSourceInit {
  
  @scala.inline
  def apply(withCredentials: js.UndefOr[scala.Boolean] = js.undefined): EventSourceInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceInit]
  }
}
