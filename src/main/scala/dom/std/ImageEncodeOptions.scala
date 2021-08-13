package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEncodeOptions extends StObject {
  
  var quality: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[java.lang.String] = js.native
}
object ImageEncodeOptions {
  
  @scala.inline
  def apply(quality: js.UndefOr[Double] = js.undefined, `type`: java.lang.String = null): ImageEncodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageEncodeOptions]
  }
}
