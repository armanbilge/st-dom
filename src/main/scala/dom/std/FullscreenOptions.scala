package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullscreenOptions extends StObject {
  
  var navigationUI: js.UndefOr[FullscreenNavigationUI] = js.native
}
object FullscreenOptions {
  
  @scala.inline
  def apply(navigationUI: FullscreenNavigationUI = null): FullscreenOptions = {
    val __obj = js.Dynamic.literal()
    if (navigationUI != null) __obj.updateDynamic("navigationUI")(navigationUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullscreenOptions]
  }
}
