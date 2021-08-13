package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCSrtpKeyParam extends StObject {
  
  var keyMethod: js.UndefOr[java.lang.String] = js.native
  
  var keySalt: js.UndefOr[java.lang.String] = js.native
  
  var lifetime: js.UndefOr[java.lang.String] = js.native
  
  var mkiLength: js.UndefOr[Double] = js.native
  
  var mkiValue: js.UndefOr[Double] = js.native
}
object RTCSrtpKeyParam {
  
  @scala.inline
  def apply(
    keyMethod: java.lang.String = null,
    keySalt: java.lang.String = null,
    lifetime: java.lang.String = null,
    mkiLength: js.UndefOr[Double] = js.undefined,
    mkiValue: js.UndefOr[Double] = js.undefined
  ): RTCSrtpKeyParam = {
    val __obj = js.Dynamic.literal()
    if (keyMethod != null) __obj.updateDynamic("keyMethod")(keyMethod.asInstanceOf[js.Any])
    if (keySalt != null) __obj.updateDynamic("keySalt")(keySalt.asInstanceOf[js.Any])
    if (lifetime != null) __obj.updateDynamic("lifetime")(lifetime.asInstanceOf[js.Any])
    if (!js.isUndefined(mkiLength)) __obj.updateDynamic("mkiLength")(mkiLength.asInstanceOf[js.Any])
    if (!js.isUndefined(mkiValue)) __obj.updateDynamic("mkiValue")(mkiValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSrtpKeyParam]
  }
}
