package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGAnimatedString interface represents string attributes which can be animated from each SVG declaration. You need to create SVG attribute before doing anything else, everything should be declared inside this. */
@js.native
trait SVGAnimatedString extends StObject {
  
  val animVal: java.lang.String = js.native
  
  var baseVal: java.lang.String = js.native
}
object SVGAnimatedString {
  
  @scala.inline
  def apply(animVal: java.lang.String, baseVal: java.lang.String): SVGAnimatedString = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedString]
  }
}
