package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDecodeOptions extends StObject {
  
  var stream: js.UndefOr[scala.Boolean] = js.native
}
object TextDecodeOptions {
  
  @scala.inline
  def apply(stream: js.UndefOr[scala.Boolean] = js.undefined): TextDecodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecodeOptions]
  }
}
