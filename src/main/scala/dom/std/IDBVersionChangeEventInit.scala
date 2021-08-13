package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBVersionChangeEventInit
  extends StObject
     with EventInit {
  
  var newVersion: js.UndefOr[Double | Null] = js.native
  
  var oldVersion: js.UndefOr[Double] = js.native
}
object IDBVersionChangeEventInit {
  
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    newVersion: js.UndefOr[Null | Double] = js.undefined,
    oldVersion: js.UndefOr[Double] = js.undefined
  ): IDBVersionChangeEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (!js.isUndefined(newVersion)) __obj.updateDynamic("newVersion")(newVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(oldVersion)) __obj.updateDynamic("oldVersion")(oldVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBVersionChangeEventInit]
  }
}
