package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasRenderingContext2DSettings extends StObject {
  
  var alpha: js.UndefOr[scala.Boolean] = js.native
  
  var desynchronized: js.UndefOr[scala.Boolean] = js.native
}
object CanvasRenderingContext2DSettings {
  
  @scala.inline
  def apply(
    alpha: js.UndefOr[scala.Boolean] = js.undefined,
    desynchronized: js.UndefOr[scala.Boolean] = js.undefined
  ): CanvasRenderingContext2DSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (!js.isUndefined(desynchronized)) __obj.updateDynamic("desynchronized")(desynchronized.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasRenderingContext2DSettings]
  }
}
