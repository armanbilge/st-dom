package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebVR API interface represents a field of view defined by 4 different degree values describing the view from a center point. */
@js.native
trait VRFieldOfView extends StObject {
  
  val downDegrees: Double = js.native
  
  val leftDegrees: Double = js.native
  
  val rightDegrees: Double = js.native
  
  val upDegrees: Double = js.native
}
object VRFieldOfView {
  
  @scala.inline
  def apply(downDegrees: Double, leftDegrees: Double, rightDegrees: Double, upDegrees: Double): VRFieldOfView = {
    val __obj = js.Dynamic.literal(downDegrees = downDegrees.asInstanceOf[js.Any], leftDegrees = leftDegrees.asInstanceOf[js.Any], rightDegrees = rightDegrees.asInstanceOf[js.Any], upDegrees = upDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRFieldOfView]
  }
}
