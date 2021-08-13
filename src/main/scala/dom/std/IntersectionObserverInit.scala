package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionObserverInit extends StObject {
  
  var root: js.UndefOr[Element | Document | Null] = js.native
  
  var rootMargin: js.UndefOr[java.lang.String] = js.native
  
  var threshold: js.UndefOr[Double | js.Array[Double]] = js.native
}
object IntersectionObserverInit {
  
  @scala.inline
  def apply(
    root: js.UndefOr[Null | Element | Document] = js.undefined,
    rootMargin: java.lang.String = null,
    threshold: Double | js.Array[Double] = null
  ): IntersectionObserverInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rootMargin != null) __obj.updateDynamic("rootMargin")(rootMargin.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionObserverInit]
  }
}
