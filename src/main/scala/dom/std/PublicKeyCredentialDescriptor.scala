package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyCredentialDescriptor extends StObject {
  
  var id: BufferSource = js.native
  
  var transports: js.UndefOr[js.Array[AuthenticatorTransport]] = js.native
  
  var `type`: PublicKeyCredentialType = js.native
}
object PublicKeyCredentialDescriptor {
  
  @scala.inline
  def apply(
    id: BufferSource,
    `type`: PublicKeyCredentialType,
    transports: js.Array[AuthenticatorTransport] = null
  ): PublicKeyCredentialDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialDescriptor]
  }
}
