package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventListenerOptions extends StObject {
  
  var capture: js.UndefOr[scala.Boolean] = js.native
}
object EventListenerOptions {
  
  @scala.inline
  def apply(capture: js.UndefOr[scala.Boolean] = js.undefined): EventListenerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListenerOptions]
  }
}
