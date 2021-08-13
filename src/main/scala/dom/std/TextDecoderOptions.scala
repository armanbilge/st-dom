package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDecoderOptions extends StObject {
  
  var fatal: js.UndefOr[scala.Boolean] = js.native
  
  var ignoreBOM: js.UndefOr[scala.Boolean] = js.native
}
object TextDecoderOptions {
  
  @scala.inline
  def apply(
    fatal: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreBOM: js.UndefOr[scala.Boolean] = js.undefined
  ): TextDecoderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fatal)) __obj.updateDynamic("fatal")(fatal.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBOM)) __obj.updateDynamic("ignoreBOM")(ignoreBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoderOptions]
  }
}
