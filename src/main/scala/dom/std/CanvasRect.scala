package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasRect extends StObject {
  
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
}
object CanvasRect {
  
  @scala.inline
  def apply(
    clearRect: (Double, Double, Double, Double) => Unit,
    fillRect: (Double, Double, Double, Double) => Unit,
    strokeRect: (Double, Double, Double, Double) => Unit
  ): CanvasRect = {
    val __obj = js.Dynamic.literal(clearRect = js.Any.fromFunction4(clearRect), fillRect = js.Any.fromFunction4(fillRect), strokeRect = js.Any.fromFunction4(strokeRect))
    __obj.asInstanceOf[CanvasRect]
  }
}
