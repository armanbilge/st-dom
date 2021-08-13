package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticatorAssertionResponse
  extends StObject
     with AuthenticatorResponse {
  
  val authenticatorData: ArrayBuffer = js.native
  
  val signature: ArrayBuffer = js.native
  
  val userHandle: ArrayBuffer | Null = js.native
}
object AuthenticatorAssertionResponse {
  
  @scala.inline
  def apply(
    authenticatorData: ArrayBuffer,
    clientDataJSON: ArrayBuffer,
    signature: ArrayBuffer,
    userHandle: ArrayBuffer = null
  ): AuthenticatorAssertionResponse = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.updateDynamic("userHandle")(if (userHandle != null) userHandle.asInstanceOf[ArrayBuffer].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[AuthenticatorAssertionResponse]
  }
}
