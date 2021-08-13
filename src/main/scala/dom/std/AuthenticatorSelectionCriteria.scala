package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticatorSelectionCriteria extends StObject {
  
  var authenticatorAttachment: js.UndefOr[AuthenticatorAttachment] = js.native
  
  var requireResidentKey: js.UndefOr[scala.Boolean] = js.native
  
  var residentKey: js.UndefOr[ResidentKeyRequirement] = js.native
  
  var userVerification: js.UndefOr[UserVerificationRequirement] = js.native
}
object AuthenticatorSelectionCriteria {
  
  @scala.inline
  def apply(
    authenticatorAttachment: AuthenticatorAttachment = null,
    requireResidentKey: js.UndefOr[scala.Boolean] = js.undefined,
    residentKey: ResidentKeyRequirement = null,
    userVerification: UserVerificationRequirement = null
  ): AuthenticatorSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    if (authenticatorAttachment != null) __obj.updateDynamic("authenticatorAttachment")(authenticatorAttachment.asInstanceOf[js.Any])
    if (!js.isUndefined(requireResidentKey)) __obj.updateDynamic("requireResidentKey")(requireResidentKey.asInstanceOf[js.Any])
    if (residentKey != null) __obj.updateDynamic("residentKey")(residentKey.asInstanceOf[js.Any])
    if (userVerification != null) __obj.updateDynamic("userVerification")(userVerification.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorSelectionCriteria]
  }
}
