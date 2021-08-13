package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebVR API interface represents the state of a VR sensor at a given timestamp (which includes orientation, position, velocity, and acceleration information.) */
@js.native
trait VRPose extends StObject {
  
  val angularAcceleration: Float32Array | Null = js.native
  
  val angularVelocity: Float32Array | Null = js.native
  
  val linearAcceleration: Float32Array | Null = js.native
  
  val linearVelocity: Float32Array | Null = js.native
  
  val orientation: Float32Array | Null = js.native
  
  val position: Float32Array | Null = js.native
}
object VRPose {
  
  @scala.inline
  def apply(
    angularAcceleration: Float32Array = null,
    angularVelocity: Float32Array = null,
    linearAcceleration: Float32Array = null,
    linearVelocity: Float32Array = null,
    orientation: Float32Array = null,
    position: Float32Array = null
  ): VRPose = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("angularAcceleration")(if (angularAcceleration != null) angularAcceleration.asInstanceOf[Float32Array].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("angularVelocity")(if (angularVelocity != null) angularVelocity.asInstanceOf[Float32Array].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("linearAcceleration")(if (linearAcceleration != null) linearAcceleration.asInstanceOf[Float32Array].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("linearVelocity")(if (linearVelocity != null) linearVelocity.asInstanceOf[Float32Array].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("orientation")(if (orientation != null) orientation.asInstanceOf[Float32Array].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("position")(if (position != null) position.asInstanceOf[Float32Array].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[VRPose]
  }
}
