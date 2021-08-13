package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGBoundingBoxOptions extends StObject {
  
  var clipped: js.UndefOr[scala.Boolean] = js.native
  
  var fill: js.UndefOr[scala.Boolean] = js.native
  
  var markers: js.UndefOr[scala.Boolean] = js.native
  
  var stroke: js.UndefOr[scala.Boolean] = js.native
}
object SVGBoundingBoxOptions {
  
  @scala.inline
  def apply(
    clipped: js.UndefOr[scala.Boolean] = js.undefined,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    markers: js.UndefOr[scala.Boolean] = js.undefined,
    stroke: js.UndefOr[scala.Boolean] = js.undefined
  ): SVGBoundingBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(markers)) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGBoundingBoxOptions]
  }
}
