package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationExtensionsClientInputs extends StObject {
  
  var appid: js.UndefOr[java.lang.String] = js.native
  
  var appidExclude: js.UndefOr[java.lang.String] = js.native
  
  var credProps: js.UndefOr[scala.Boolean] = js.native
  
  var uvm: js.UndefOr[scala.Boolean] = js.native
}
object AuthenticationExtensionsClientInputs {
  
  @scala.inline
  def apply(
    appid: java.lang.String = null,
    appidExclude: java.lang.String = null,
    credProps: js.UndefOr[scala.Boolean] = js.undefined,
    uvm: js.UndefOr[scala.Boolean] = js.undefined
  ): AuthenticationExtensionsClientInputs = {
    val __obj = js.Dynamic.literal()
    if (appid != null) __obj.updateDynamic("appid")(appid.asInstanceOf[js.Any])
    if (appidExclude != null) __obj.updateDynamic("appidExclude")(appidExclude.asInstanceOf[js.Any])
    if (!js.isUndefined(credProps)) __obj.updateDynamic("credProps")(credProps.asInstanceOf[js.Any])
    if (!js.isUndefined(uvm)) __obj.updateDynamic("uvm")(uvm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationExtensionsClientInputs]
  }
}
