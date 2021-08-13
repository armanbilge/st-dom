package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaKeySystemMediaCapability extends StObject {
  
  var contentType: js.UndefOr[java.lang.String] = js.native
  
  var robustness: js.UndefOr[java.lang.String] = js.native
}
object MediaKeySystemMediaCapability {
  
  @scala.inline
  def apply(contentType: java.lang.String = null, robustness: java.lang.String = null): MediaKeySystemMediaCapability = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (robustness != null) __obj.updateDynamic("robustness")(robustness.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeySystemMediaCapability]
  }
}
