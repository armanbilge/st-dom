package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusNavigationOrigin extends StObject {
  
  var originHeight: js.UndefOr[Double] = js.native
  
  var originLeft: js.UndefOr[Double] = js.native
  
  var originTop: js.UndefOr[Double] = js.native
  
  var originWidth: js.UndefOr[Double] = js.native
}
object FocusNavigationOrigin {
  
  @scala.inline
  def apply(
    originHeight: js.UndefOr[Double] = js.undefined,
    originLeft: js.UndefOr[Double] = js.undefined,
    originTop: js.UndefOr[Double] = js.undefined,
    originWidth: js.UndefOr[Double] = js.undefined
  ): FocusNavigationOrigin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(originHeight)) __obj.updateDynamic("originHeight")(originHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(originLeft)) __obj.updateDynamic("originLeft")(originLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(originTop)) __obj.updateDynamic("originTop")(originTop.asInstanceOf[js.Any])
    if (!js.isUndefined(originWidth)) __obj.updateDynamic("originWidth")(originWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusNavigationOrigin]
  }
}
