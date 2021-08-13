package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of basic type <angle> which can be animated. */
@js.native
trait SVGAnimatedAngle extends StObject {
  
  val animVal: SVGAngle = js.native
  
  val baseVal: SVGAngle = js.native
}
object SVGAnimatedAngle {
  
  @scala.inline
  def apply(animVal: SVGAngle, baseVal: SVGAngle): SVGAnimatedAngle = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedAngle]
  }
}
