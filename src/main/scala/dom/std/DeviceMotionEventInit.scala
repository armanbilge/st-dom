package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceMotionEventInit
  extends StObject
     with EventInit {
  
  var acceleration: js.UndefOr[DeviceMotionEventAccelerationInit] = js.native
  
  var accelerationIncludingGravity: js.UndefOr[DeviceMotionEventAccelerationInit] = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var rotationRate: js.UndefOr[DeviceMotionEventRotationRateInit] = js.native
}
object DeviceMotionEventInit {
  
  @scala.inline
  def apply(
    acceleration: DeviceMotionEventAccelerationInit = null,
    accelerationIncludingGravity: DeviceMotionEventAccelerationInit = null,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    rotationRate: DeviceMotionEventRotationRateInit = null
  ): DeviceMotionEventInit = {
    val __obj = js.Dynamic.literal()
    if (acceleration != null) __obj.updateDynamic("acceleration")(acceleration.asInstanceOf[js.Any])
    if (accelerationIncludingGravity != null) __obj.updateDynamic("accelerationIncludingGravity")(accelerationIncludingGravity.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (rotationRate != null) __obj.updateDynamic("rotationRate")(rotationRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMotionEventInit]
  }
}
