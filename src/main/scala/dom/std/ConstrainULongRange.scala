package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstrainULongRange
  extends StObject
     with ULongRange {
  
  var exact: js.UndefOr[Double] = js.native
  
  var ideal: js.UndefOr[Double] = js.native
}
object ConstrainULongRange {
  
  @scala.inline
  def apply(
    exact: js.UndefOr[Double] = js.undefined,
    ideal: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined
  ): ConstrainULongRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (!js.isUndefined(ideal)) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainULongRange]
  }
}
