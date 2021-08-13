package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the rate at which the device is rotating around all three axes. */
@js.native
trait DeviceRotationRate extends StObject {
  
  val alpha: Double | Null = js.native
  
  val beta: Double | Null = js.native
  
  val gamma: Double | Null = js.native
}
object DeviceRotationRate {
  
  @scala.inline
  def apply(
    alpha: Double = null.asInstanceOf[Double],
    beta: Double = null.asInstanceOf[Double],
    gamma: Double = null.asInstanceOf[Double]
  ): DeviceRotationRate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alpha")(if (alpha != null) alpha.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("beta")(if (beta != null) beta.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("gamma")(if (gamma != null) gamma.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[DeviceRotationRate]
  }
}
