package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRootNodeOptions extends StObject {
  
  var composed: js.UndefOr[scala.Boolean] = js.native
}
object GetRootNodeOptions {
  
  @scala.inline
  def apply(composed: js.UndefOr[scala.Boolean] = js.undefined): GetRootNodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRootNodeOptions]
  }
}
