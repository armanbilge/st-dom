package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the amount of acceleration the device is experiencing along all three axes. */
@js.native
trait DeviceAcceleration extends StObject {
  
  val x: Double | Null = js.native
  
  val y: Double | Null = js.native
  
  val z: Double | Null = js.native
}
object DeviceAcceleration {
  
  @scala.inline
  def apply(
    x: Double = null.asInstanceOf[Double],
    y: Double = null.asInstanceOf[Double],
    z: Double = null.asInstanceOf[Double]
  ): DeviceAcceleration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(if (x != null) x.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("y")(if (y != null) y.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("z")(if (z != null) z.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[DeviceAcceleration]
  }
}
