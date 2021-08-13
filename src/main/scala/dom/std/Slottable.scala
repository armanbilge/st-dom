package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slottable extends StObject {
  
  val assignedSlot: HTMLSlotElement | Null = js.native
}
object Slottable {
  
  @scala.inline
  def apply(assignedSlot: HTMLSlotElement = null): Slottable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assignedSlot")(if (assignedSlot != null) assignedSlot.asInstanceOf[HTMLSlotElement].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[Slottable]
  }
}
