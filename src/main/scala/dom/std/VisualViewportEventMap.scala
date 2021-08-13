package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualViewportEventMap extends StObject {
  
  var resize: UIEvent = js.native
  
  var scroll: Event = js.native
}
object VisualViewportEventMap {
  
  @scala.inline
  def apply(resize: UIEvent, scroll: Event): VisualViewportEventMap = {
    val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualViewportEventMap]
  }
}
