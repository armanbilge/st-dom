package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Intersection Observer API interface describes the intersection between the target element and its root container at a specific moment of transition. */
@js.native
trait IntersectionObserverEntry extends StObject {
  
  val boundingClientRect: DOMRectReadOnly = js.native
  
  val intersectionRatio: Double = js.native
  
  val intersectionRect: DOMRectReadOnly = js.native
  
  val isIntersecting: scala.Boolean = js.native
  
  val rootBounds: DOMRectReadOnly | Null = js.native
  
  val target: Element = js.native
  
  val time: Double = js.native
}
object IntersectionObserverEntry {
  
  @scala.inline
  def apply(
    boundingClientRect: DOMRectReadOnly,
    intersectionRatio: Double,
    intersectionRect: DOMRectReadOnly,
    isIntersecting: scala.Boolean,
    target: Element,
    time: Double,
    rootBounds: DOMRectReadOnly = null
  ): IntersectionObserverEntry = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], isIntersecting = isIntersecting.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.updateDynamic("rootBounds")(if (rootBounds != null) rootBounds.asInstanceOf[DOMRectReadOnly].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[IntersectionObserverEntry]
  }
}
