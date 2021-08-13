package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGAnimatedNumber interface is used for attributes which take a list of numbers and which can be animated. */
@js.native
trait SVGAnimatedNumberList extends StObject {
  
  val animVal: SVGNumberList = js.native
  
  val baseVal: SVGNumberList = js.native
}
object SVGAnimatedNumberList {
  
  @scala.inline
  def apply(animVal: SVGNumberList, baseVal: SVGNumberList): SVGAnimatedNumberList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumberList]
  }
}
