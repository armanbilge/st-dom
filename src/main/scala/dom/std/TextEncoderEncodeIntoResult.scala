package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEncoderEncodeIntoResult extends StObject {
  
  var read: js.UndefOr[Double] = js.native
  
  var written: js.UndefOr[Double] = js.native
}
object TextEncoderEncodeIntoResult {
  
  @scala.inline
  def apply(read: js.UndefOr[Double] = js.undefined, written: js.UndefOr[Double] = js.undefined): TextEncoderEncodeIntoResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (!js.isUndefined(written)) __obj.updateDynamic("written")(written.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoderEncodeIntoResult]
  }
}
