package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMRectReadOnly extends StObject {
  
  val bottom: Double = js.native
  
  val height: Double = js.native
  
  val left: Double = js.native
  
  val right: Double = js.native
  
  def toJSON(): js.Any = js.native
  
  val top: Double = js.native
  
  val width: Double = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
}
object DOMRectReadOnly {
  
  @scala.inline
  def apply(
    bottom: Double,
    height: Double,
    left: Double,
    right: Double,
    toJSON: () => js.Any,
    top: Double,
    width: Double,
    x: Double,
    y: Double
  ): DOMRectReadOnly = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMRectReadOnly]
  }
}
