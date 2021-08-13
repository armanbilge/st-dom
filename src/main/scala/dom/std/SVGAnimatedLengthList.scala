package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of type SVGLengthList which can be animated. */
@js.native
trait SVGAnimatedLengthList extends StObject {
  
  val animVal: SVGLengthList = js.native
  
  val baseVal: SVGLengthList = js.native
}
object SVGAnimatedLengthList {
  
  @scala.inline
  def apply(animVal: SVGLengthList, baseVal: SVGLengthList): SVGAnimatedLengthList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLengthList]
  }
}
