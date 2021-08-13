package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialRequestOptions extends StObject {
  
  var mediation: js.UndefOr[CredentialMediationRequirement] = js.native
  
  var publicKey: js.UndefOr[PublicKeyCredentialRequestOptions] = js.native
  
  var signal: js.UndefOr[AbortSignal] = js.native
}
object CredentialRequestOptions {
  
  @scala.inline
  def apply(
    mediation: CredentialMediationRequirement = null,
    publicKey: PublicKeyCredentialRequestOptions = null,
    signal: AbortSignal = null
  ): CredentialRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (mediation != null) __obj.updateDynamic("mediation")(mediation.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialRequestOptions]
  }
}
