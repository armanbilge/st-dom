package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionObserverEntryInit extends StObject {
  
  var boundingClientRect: DOMRectInit = js.native
  
  var intersectionRatio: Double = js.native
  
  var intersectionRect: DOMRectInit = js.native
  
  var isIntersecting: scala.Boolean = js.native
  
  var rootBounds: DOMRectInit | Null = js.native
  
  var target: Element = js.native
  
  var time: Double = js.native
}
object IntersectionObserverEntryInit {
  
  @scala.inline
  def apply(
    boundingClientRect: DOMRectInit,
    intersectionRatio: Double,
    intersectionRect: DOMRectInit,
    isIntersecting: scala.Boolean,
    target: Element,
    time: Double,
    rootBounds: DOMRectInit = null
  ): IntersectionObserverEntryInit = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], isIntersecting = isIntersecting.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.updateDynamic("rootBounds")(if (rootBounds != null) rootBounds.asInstanceOf[DOMRectInit].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[IntersectionObserverEntryInit]
  }
}
