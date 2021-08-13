package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of type SVGPreserveAspectRatio which can be animated. */
@js.native
trait SVGAnimatedPreserveAspectRatio extends StObject {
  
  val animVal: SVGPreserveAspectRatio = js.native
  
  val baseVal: SVGPreserveAspectRatio = js.native
}
object SVGAnimatedPreserveAspectRatio {
  
  @scala.inline
  def apply(animVal: SVGPreserveAspectRatio, baseVal: SVGPreserveAspectRatio): SVGAnimatedPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPreserveAspectRatio]
  }
}
