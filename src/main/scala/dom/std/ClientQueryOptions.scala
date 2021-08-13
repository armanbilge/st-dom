package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientQueryOptions extends StObject {
  
  var includeUncontrolled: js.UndefOr[scala.Boolean] = js.native
  
  var `type`: js.UndefOr[ClientTypes] = js.native
}
object ClientQueryOptions {
  
  @scala.inline
  def apply(includeUncontrolled: js.UndefOr[scala.Boolean] = js.undefined, `type`: ClientTypes = null): ClientQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeUncontrolled)) __obj.updateDynamic("includeUncontrolled")(includeUncontrolled.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientQueryOptions]
  }
}
