package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebVR API interface represents all the information required to correctly render a scene for a given eye, including field of view information. */
@js.native
trait VREyeParameters extends StObject {
  
  /** @deprecated */
  val fieldOfView: VRFieldOfView = js.native
  
  val offset: Float32Array = js.native
  
  val renderHeight: Double = js.native
  
  val renderWidth: Double = js.native
}
object VREyeParameters {
  
  @scala.inline
  def apply(fieldOfView: VRFieldOfView, offset: Float32Array, renderHeight: Double, renderWidth: Double): VREyeParameters = {
    val __obj = js.Dynamic.literal(fieldOfView = fieldOfView.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], renderHeight = renderHeight.asInstanceOf[js.Any], renderWidth = renderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VREyeParameters]
  }
}
