package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// DOM APIs
/////////////////////////////
@js.native
trait AddEventListenerOptions
  extends StObject
     with EventListenerOptions {
  
  var once: js.UndefOr[scala.Boolean] = js.native
  
  var passive: js.UndefOr[scala.Boolean] = js.native
}
object AddEventListenerOptions {
  
  @scala.inline
  def apply(
    capture: js.UndefOr[scala.Boolean] = js.undefined,
    once: js.UndefOr[scala.Boolean] = js.undefined,
    passive: js.UndefOr[scala.Boolean] = js.undefined
  ): AddEventListenerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddEventListenerOptions]
  }
}
