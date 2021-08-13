package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowRootInit extends StObject {
  
  var delegatesFocus: js.UndefOr[scala.Boolean] = js.native
  
  var mode: ShadowRootMode = js.native
}
object ShadowRootInit {
  
  @scala.inline
  def apply(mode: ShadowRootMode, delegatesFocus: js.UndefOr[scala.Boolean] = js.undefined): ShadowRootInit = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (!js.isUndefined(delegatesFocus)) __obj.updateDynamic("delegatesFocus")(delegatesFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootInit]
  }
}
