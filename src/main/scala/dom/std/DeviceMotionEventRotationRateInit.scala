package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceMotionEventRotationRateInit extends StObject {
  
  var alpha: js.UndefOr[Double | Null] = js.native
  
  var beta: js.UndefOr[Double | Null] = js.native
  
  var gamma: js.UndefOr[Double | Null] = js.native
}
object DeviceMotionEventRotationRateInit {
  
  @scala.inline
  def apply(
    alpha: js.UndefOr[Null | Double] = js.undefined,
    beta: js.UndefOr[Null | Double] = js.undefined,
    gamma: js.UndefOr[Null | Double] = js.undefined
  ): DeviceMotionEventRotationRateInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (!js.isUndefined(beta)) __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    if (!js.isUndefined(gamma)) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMotionEventRotationRateInit]
  }
}
