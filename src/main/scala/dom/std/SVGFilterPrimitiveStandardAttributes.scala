package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGFilterPrimitiveStandardAttributes extends StObject {
  
  val height: SVGAnimatedLength = js.native
  
  val result: SVGAnimatedString = js.native
  
  val width: SVGAnimatedLength = js.native
  
  val x: SVGAnimatedLength = js.native
  
  val y: SVGAnimatedLength = js.native
}
object SVGFilterPrimitiveStandardAttributes {
  
  @scala.inline
  def apply(
    height: SVGAnimatedLength,
    result: SVGAnimatedString,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    y: SVGAnimatedLength
  ): SVGFilterPrimitiveStandardAttributes = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGFilterPrimitiveStandardAttributes]
  }
}
