package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheQueryOptions extends StObject {
  
  var ignoreMethod: js.UndefOr[scala.Boolean] = js.native
  
  var ignoreSearch: js.UndefOr[scala.Boolean] = js.native
  
  var ignoreVary: js.UndefOr[scala.Boolean] = js.native
}
object CacheQueryOptions {
  
  @scala.inline
  def apply(
    ignoreMethod: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreSearch: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreVary: js.UndefOr[scala.Boolean] = js.undefined
  ): CacheQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreMethod)) __obj.updateDynamic("ignoreMethod")(ignoreMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSearch)) __obj.updateDynamic("ignoreSearch")(ignoreSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreVary)) __obj.updateDynamic("ignoreVary")(ignoreVary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheQueryOptions]
  }
}
