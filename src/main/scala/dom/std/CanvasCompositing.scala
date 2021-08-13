package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasCompositing extends StObject {
  
  var globalAlpha: Double = js.native
  
  var globalCompositeOperation: java.lang.String = js.native
}
object CanvasCompositing {
  
  @scala.inline
  def apply(globalAlpha: Double, globalCompositeOperation: java.lang.String): CanvasCompositing = {
    val __obj = js.Dynamic.literal(globalAlpha = globalAlpha.asInstanceOf[js.Any], globalCompositeOperation = globalCompositeOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasCompositing]
  }
}
