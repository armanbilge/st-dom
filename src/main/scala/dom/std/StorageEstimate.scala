package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageEstimate extends StObject {
  
  var quota: js.UndefOr[Double] = js.native
  
  var usage: js.UndefOr[Double] = js.native
}
object StorageEstimate {
  
  @scala.inline
  def apply(quota: js.UndefOr[Double] = js.undefined, usage: js.UndefOr[Double] = js.undefined): StorageEstimate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quota)) __obj.updateDynamic("quota")(quota.asInstanceOf[js.Any])
    if (!js.isUndefined(usage)) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageEstimate]
  }
}
