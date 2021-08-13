package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of type boolean which can be animated. */
@js.native
trait SVGAnimatedBoolean extends StObject {
  
  val animVal: scala.Boolean = js.native
  
  var baseVal: scala.Boolean = js.native
}
object SVGAnimatedBoolean {
  
  @scala.inline
  def apply(animVal: scala.Boolean, baseVal: scala.Boolean): SVGAnimatedBoolean = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedBoolean]
  }
}
