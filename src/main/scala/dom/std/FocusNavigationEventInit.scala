package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusNavigationEventInit
  extends StObject
     with EventInit {
  
  var navigationReason: js.UndefOr[java.lang.String | Null] = js.native
  
  var originHeight: js.UndefOr[Double] = js.native
  
  var originLeft: js.UndefOr[Double] = js.native
  
  var originTop: js.UndefOr[Double] = js.native
  
  var originWidth: js.UndefOr[Double] = js.native
}
object FocusNavigationEventInit {
  
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    navigationReason: js.UndefOr[Null | java.lang.String] = js.undefined,
    originHeight: js.UndefOr[Double] = js.undefined,
    originLeft: js.UndefOr[Double] = js.undefined,
    originTop: js.UndefOr[Double] = js.undefined,
    originWidth: js.UndefOr[Double] = js.undefined
  ): FocusNavigationEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationReason)) __obj.updateDynamic("navigationReason")(navigationReason.asInstanceOf[js.Any])
    if (!js.isUndefined(originHeight)) __obj.updateDynamic("originHeight")(originHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(originLeft)) __obj.updateDynamic("originLeft")(originLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(originTop)) __obj.updateDynamic("originTop")(originTop.asInstanceOf[js.Any])
    if (!js.isUndefined(originWidth)) __obj.updateDynamic("originWidth")(originWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusNavigationEventInit]
  }
}
