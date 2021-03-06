package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyCredentialCreationOptions extends StObject {
  
  var attestation: js.UndefOr[AttestationConveyancePreference] = js.native
  
  var authenticatorSelection: js.UndefOr[AuthenticatorSelectionCriteria] = js.native
  
  var challenge: BufferSource = js.native
  
  var excludeCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.native
  
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.native
  
  var pubKeyCredParams: js.Array[PublicKeyCredentialParameters] = js.native
  
  var rp: PublicKeyCredentialRpEntity = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var user: PublicKeyCredentialUserEntity = js.native
}
object PublicKeyCredentialCreationOptions {
  
  @scala.inline
  def apply(
    challenge: BufferSource,
    pubKeyCredParams: js.Array[PublicKeyCredentialParameters],
    rp: PublicKeyCredentialRpEntity,
    user: PublicKeyCredentialUserEntity,
    attestation: AttestationConveyancePreference = null,
    authenticatorSelection: AuthenticatorSelectionCriteria = null,
    excludeCredentials: js.Array[PublicKeyCredentialDescriptor] = null,
    extensions: AuthenticationExtensionsClientInputs = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): PublicKeyCredentialCreationOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], pubKeyCredParams = pubKeyCredParams.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (attestation != null) __obj.updateDynamic("attestation")(attestation.asInstanceOf[js.Any])
    if (authenticatorSelection != null) __obj.updateDynamic("authenticatorSelection")(authenticatorSelection.asInstanceOf[js.Any])
    if (excludeCredentials != null) __obj.updateDynamic("excludeCredentials")(excludeCredentials.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialCreationOptions]
  }
}
