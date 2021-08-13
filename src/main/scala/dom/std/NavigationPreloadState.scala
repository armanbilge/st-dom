package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationPreloadState extends StObject {
  
  var enabled: js.UndefOr[scala.Boolean] = js.native
  
  var headerValue: js.UndefOr[java.lang.String] = js.native
}
object NavigationPreloadState {
  
  @scala.inline
  def apply(enabled: js.UndefOr[scala.Boolean] = js.undefined, headerValue: java.lang.String = null): NavigationPreloadState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (headerValue != null) __obj.updateDynamic("headerValue")(headerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPreloadState]
  }
}
