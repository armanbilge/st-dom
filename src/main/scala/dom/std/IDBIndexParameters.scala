package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBIndexParameters extends StObject {
  
  var multiEntry: js.UndefOr[scala.Boolean] = js.native
  
  var unique: js.UndefOr[scala.Boolean] = js.native
}
object IDBIndexParameters {
  
  @scala.inline
  def apply(
    multiEntry: js.UndefOr[scala.Boolean] = js.undefined,
    unique: js.UndefOr[scala.Boolean] = js.undefined
  ): IDBIndexParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multiEntry)) __obj.updateDynamic("multiEntry")(multiEntry.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBIndexParameters]
  }
}
