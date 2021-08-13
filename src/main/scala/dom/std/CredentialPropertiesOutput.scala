package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialPropertiesOutput extends StObject {
  
  var rk: js.UndefOr[scala.Boolean] = js.native
}
object CredentialPropertiesOutput {
  
  @scala.inline
  def apply(rk: js.UndefOr[scala.Boolean] = js.undefined): CredentialPropertiesOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rk)) __obj.updateDynamic("rk")(rk.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialPropertiesOutput]
  }
}
