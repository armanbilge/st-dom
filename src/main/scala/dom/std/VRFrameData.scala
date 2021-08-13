package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebVR API interface represents all the information needed to render a single frame of a VR scene; constructed by VRDisplay.getFrameData(). */
@js.native
trait VRFrameData extends StObject {
  
  val leftProjectionMatrix: Float32Array = js.native
  
  val leftViewMatrix: Float32Array = js.native
  
  val pose: VRPose = js.native
  
  val rightProjectionMatrix: Float32Array = js.native
  
  val rightViewMatrix: Float32Array = js.native
  
  val timestamp: Double = js.native
}
object VRFrameData {
  
  @scala.inline
  def apply(
    leftProjectionMatrix: Float32Array,
    leftViewMatrix: Float32Array,
    pose: VRPose,
    rightProjectionMatrix: Float32Array,
    rightViewMatrix: Float32Array,
    timestamp: Double
  ): VRFrameData = {
    val __obj = js.Dynamic.literal(leftProjectionMatrix = leftProjectionMatrix.asInstanceOf[js.Any], leftViewMatrix = leftViewMatrix.asInstanceOf[js.Any], pose = pose.asInstanceOf[js.Any], rightProjectionMatrix = rightProjectionMatrix.asInstanceOf[js.Any], rightViewMatrix = rightViewMatrix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRFrameData]
  }
}
