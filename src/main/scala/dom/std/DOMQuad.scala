package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMQuad extends StObject {
  
  def getBounds(): DOMRect = js.native
  
  val p1: DOMPoint = js.native
  
  val p2: DOMPoint = js.native
  
  val p3: DOMPoint = js.native
  
  val p4: DOMPoint = js.native
  
  def toJSON(): js.Any = js.native
}
object DOMQuad {
  
  @scala.inline
  def apply(
    getBounds: () => DOMRect,
    p1: DOMPoint,
    p2: DOMPoint,
    p3: DOMPoint,
    p4: DOMPoint,
    toJSON: () => js.Any
  ): DOMQuad = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any], p4 = p4.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[DOMQuad]
  }
}
