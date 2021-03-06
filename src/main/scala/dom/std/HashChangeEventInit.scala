package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashChangeEventInit
  extends StObject
     with EventInit {
  
  var newURL: js.UndefOr[java.lang.String] = js.native
  
  var oldURL: js.UndefOr[java.lang.String] = js.native
}
object HashChangeEventInit {
  
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    newURL: java.lang.String = null,
    oldURL: java.lang.String = null
  ): HashChangeEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (newURL != null) __obj.updateDynamic("newURL")(newURL.asInstanceOf[js.Any])
    if (oldURL != null) __obj.updateDynamic("oldURL")(oldURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashChangeEventInit]
  }
}
