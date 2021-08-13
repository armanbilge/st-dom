package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Gamepad API interface defines an individual gamepad or other controller, allowing access to information such as button presses, axis positions, and id. */
@js.native
trait Gamepad extends StObject {
  
  val axes: js.Array[Double] = js.native
  
  val buttons: js.Array[GamepadButton] = js.native
  
  val connected: scala.Boolean = js.native
  
  val hand: GamepadHand = js.native
  
  val hapticActuators: js.Array[GamepadHapticActuator] = js.native
  
  val id: java.lang.String = js.native
  
  val index: Double = js.native
  
  val mapping: GamepadMappingType = js.native
  
  val pose: GamepadPose | Null = js.native
  
  val timestamp: Double = js.native
}
object Gamepad {
  
  @scala.inline
  def apply(
    axes: js.Array[Double],
    buttons: js.Array[GamepadButton],
    connected: scala.Boolean,
    hand: GamepadHand,
    hapticActuators: js.Array[GamepadHapticActuator],
    id: java.lang.String,
    index: Double,
    mapping: GamepadMappingType,
    timestamp: Double,
    pose: GamepadPose = null
  ): Gamepad = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], hand = hand.asInstanceOf[js.Any], hapticActuators = hapticActuators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("pose")(if (pose != null) pose.asInstanceOf[GamepadPose].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[Gamepad]
  }
}
