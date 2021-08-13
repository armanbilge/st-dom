package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseRejectionEventInit
  extends StObject
     with EventInit {
  
  var promise: js.Promise[js.Any] = js.native
  
  var reason: js.UndefOr[js.Any] = js.native
}
object PromiseRejectionEventInit {
  
  @scala.inline
  def apply(
    promise: js.Promise[js.Any],
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    reason: js.Any = null
  ): PromiseRejectionEventInit = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseRejectionEventInit]
  }
}
