package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationExtensionsClientOutputs extends StObject {
  
  var appid: js.UndefOr[scala.Boolean] = js.native
  
  var credProps: js.UndefOr[CredentialPropertiesOutput] = js.native
  
  var uvm: js.UndefOr[UvmEntries] = js.native
}
object AuthenticationExtensionsClientOutputs {
  
  @scala.inline
  def apply(
    appid: js.UndefOr[scala.Boolean] = js.undefined,
    credProps: CredentialPropertiesOutput = null,
    uvm: UvmEntries = null
  ): AuthenticationExtensionsClientOutputs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appid)) __obj.updateDynamic("appid")(appid.asInstanceOf[js.Any])
    if (credProps != null) __obj.updateDynamic("credProps")(credProps.asInstanceOf[js.Any])
    if (uvm != null) __obj.updateDynamic("uvm")(uvm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationExtensionsClientOutputs]
  }
}
