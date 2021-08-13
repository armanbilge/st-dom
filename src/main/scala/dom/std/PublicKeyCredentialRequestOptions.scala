package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyCredentialRequestOptions extends StObject {
  
  var allowCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.native
  
  var challenge: BufferSource = js.native
  
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.native
  
  var rpId: js.UndefOr[java.lang.String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var userVerification: js.UndefOr[UserVerificationRequirement] = js.native
}
object PublicKeyCredentialRequestOptions {
  
  @scala.inline
  def apply(
    challenge: BufferSource,
    allowCredentials: js.Array[PublicKeyCredentialDescriptor] = null,
    extensions: AuthenticationExtensionsClientInputs = null,
    rpId: java.lang.String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    userVerification: UserVerificationRequirement = null
  ): PublicKeyCredentialRequestOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any])
    if (allowCredentials != null) __obj.updateDynamic("allowCredentials")(allowCredentials.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (rpId != null) __obj.updateDynamic("rpId")(rpId.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userVerification != null) __obj.updateDynamic("userVerification")(userVerification.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRequestOptions]
  }
}
