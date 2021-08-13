package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchInit extends StObject {
  
  var altitudeAngle: js.UndefOr[Double] = js.native
  
  var azimuthAngle: js.UndefOr[Double] = js.native
  
  var clientX: js.UndefOr[Double] = js.native
  
  var clientY: js.UndefOr[Double] = js.native
  
  var force: js.UndefOr[Double] = js.native
  
  var identifier: Double = js.native
  
  var pageX: js.UndefOr[Double] = js.native
  
  var pageY: js.UndefOr[Double] = js.native
  
  var radiusX: js.UndefOr[Double] = js.native
  
  var radiusY: js.UndefOr[Double] = js.native
  
  var rotationAngle: js.UndefOr[Double] = js.native
  
  var screenX: js.UndefOr[Double] = js.native
  
  var screenY: js.UndefOr[Double] = js.native
  
  var target: EventTarget = js.native
  
  var touchType: js.UndefOr[TouchType] = js.native
}
object TouchInit {
  
  @scala.inline
  def apply(
    identifier: Double,
    target: EventTarget,
    altitudeAngle: js.UndefOr[Double] = js.undefined,
    azimuthAngle: js.UndefOr[Double] = js.undefined,
    clientX: js.UndefOr[Double] = js.undefined,
    clientY: js.UndefOr[Double] = js.undefined,
    force: js.UndefOr[Double] = js.undefined,
    pageX: js.UndefOr[Double] = js.undefined,
    pageY: js.UndefOr[Double] = js.undefined,
    radiusX: js.UndefOr[Double] = js.undefined,
    radiusY: js.UndefOr[Double] = js.undefined,
    rotationAngle: js.UndefOr[Double] = js.undefined,
    screenX: js.UndefOr[Double] = js.undefined,
    screenY: js.UndefOr[Double] = js.undefined,
    touchType: TouchType = null
  ): TouchInit = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(altitudeAngle)) __obj.updateDynamic("altitudeAngle")(altitudeAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(azimuthAngle)) __obj.updateDynamic("azimuthAngle")(azimuthAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(clientX)) __obj.updateDynamic("clientX")(clientX.asInstanceOf[js.Any])
    if (!js.isUndefined(clientY)) __obj.updateDynamic("clientY")(clientY.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(pageX)) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (!js.isUndefined(pageY)) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusX)) __obj.updateDynamic("radiusX")(radiusX.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusY)) __obj.updateDynamic("radiusY")(radiusY.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationAngle)) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(screenX)) __obj.updateDynamic("screenX")(screenX.asInstanceOf[js.Any])
    if (!js.isUndefined(screenY)) __obj.updateDynamic("screenY")(screenY.asInstanceOf[js.Any])
    if (touchType != null) __obj.updateDynamic("touchType")(touchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchInit]
  }
}
