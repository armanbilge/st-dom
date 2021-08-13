package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes which take a list of numbers and which can be animated. */
@js.native
trait SVGAnimatedTransformList extends StObject {
  
  val animVal: SVGTransformList = js.native
  
  val baseVal: SVGTransformList = js.native
}
object SVGAnimatedTransformList {
  
  @scala.inline
  def apply(animVal: SVGTransformList, baseVal: SVGTransformList): SVGAnimatedTransformList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedTransformList]
  }
}
