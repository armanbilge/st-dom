package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of basic SVGRect which can be animated. */
@js.native
trait SVGAnimatedRect extends StObject {
  
  val animVal: DOMRectReadOnly = js.native
  
  val baseVal: DOMRect = js.native
}
object SVGAnimatedRect {
  
  @scala.inline
  def apply(animVal: DOMRectReadOnly, baseVal: DOMRect): SVGAnimatedRect = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedRect]
  }
}
