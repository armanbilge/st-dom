package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeObserverEntry extends StObject {
  
  val borderBoxSize: js.Array[ResizeObserverSize] = js.native
  
  val contentBoxSize: js.Array[ResizeObserverSize] = js.native
  
  val contentRect: DOMRectReadOnly = js.native
  
  val target: Element = js.native
}
object ResizeObserverEntry {
  
  @scala.inline
  def apply(
    borderBoxSize: js.Array[ResizeObserverSize],
    contentBoxSize: js.Array[ResizeObserverSize],
    contentRect: DOMRectReadOnly,
    target: Element
  ): ResizeObserverEntry = {
    val __obj = js.Dynamic.literal(borderBoxSize = borderBoxSize.asInstanceOf[js.Any], contentBoxSize = contentBoxSize.asInstanceOf[js.Any], contentRect = contentRect.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverEntry]
  }
}
