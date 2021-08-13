package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGFitToViewBox extends StObject {
  
  val preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  
  val viewBox: SVGAnimatedRect = js.native
}
object SVGFitToViewBox {
  
  @scala.inline
  def apply(preserveAspectRatio: SVGAnimatedPreserveAspectRatio, viewBox: SVGAnimatedRect): SVGFitToViewBox = {
    val __obj = js.Dynamic.literal(preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGFitToViewBox]
  }
}
