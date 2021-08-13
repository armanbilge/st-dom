package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioParamDescriptor extends StObject {
  
  var automationRate: js.UndefOr[AutomationRate] = js.native
  
  var defaultValue: js.UndefOr[Double] = js.native
  
  var maxValue: js.UndefOr[Double] = js.native
  
  var minValue: js.UndefOr[Double] = js.native
  
  var name: java.lang.String = js.native
}
object AudioParamDescriptor {
  
  @scala.inline
  def apply(
    name: java.lang.String,
    automationRate: AutomationRate = null,
    defaultValue: js.UndefOr[Double] = js.undefined,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined
  ): AudioParamDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (automationRate != null) __obj.updateDynamic("automationRate")(automationRate.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParamDescriptor]
  }
}
