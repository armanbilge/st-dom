package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageBitmapRenderingContextSettings extends StObject {
  
  var alpha: js.UndefOr[scala.Boolean] = js.native
}
object ImageBitmapRenderingContextSettings {
  
  @scala.inline
  def apply(alpha: js.UndefOr[scala.Boolean] = js.undefined): ImageBitmapRenderingContextSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBitmapRenderingContextSettings]
  }
}
