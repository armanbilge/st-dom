package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioTimestamp extends StObject {
  
  var contextTime: js.UndefOr[Double] = js.native
  
  var performanceTime: js.UndefOr[Double] = js.native
}
object AudioTimestamp {
  
  @scala.inline
  def apply(contextTime: js.UndefOr[Double] = js.undefined, performanceTime: js.UndefOr[Double] = js.undefined): AudioTimestamp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contextTime)) __obj.updateDynamic("contextTime")(contextTime.asInstanceOf[js.Any])
    if (!js.isUndefined(performanceTime)) __obj.updateDynamic("performanceTime")(performanceTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTimestamp]
  }
}
