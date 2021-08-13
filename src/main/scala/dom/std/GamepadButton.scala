package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An individual button of a gamepad or other controller, allowing access to the current state of different types of buttons available on the control device. */
@js.native
trait GamepadButton extends StObject {
  
  val pressed: scala.Boolean = js.native
  
  val touched: scala.Boolean = js.native
  
  val value: Double = js.native
}
object GamepadButton {
  
  @scala.inline
  def apply(pressed: scala.Boolean, touched: scala.Boolean, value: Double): GamepadButton = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadButton]
  }
}
