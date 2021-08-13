package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusOptions extends StObject {
  
  var preventScroll: js.UndefOr[scala.Boolean] = js.native
}
object FocusOptions {
  
  @scala.inline
  def apply(preventScroll: js.UndefOr[scala.Boolean] = js.undefined): FocusOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preventScroll)) __obj.updateDynamic("preventScroll")(preventScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusOptions]
  }
}
