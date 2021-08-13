package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedNodesOptions extends StObject {
  
  var flatten: js.UndefOr[scala.Boolean] = js.native
}
object AssignedNodesOptions {
  
  @scala.inline
  def apply(flatten: js.UndefOr[scala.Boolean] = js.undefined): AssignedNodesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignedNodesOptions]
  }
}
