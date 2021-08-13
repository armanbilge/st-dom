package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialCreationOptions extends StObject {
  
  var publicKey: js.UndefOr[PublicKeyCredentialCreationOptions] = js.native
  
  var signal: js.UndefOr[AbortSignal] = js.native
}
object CredentialCreationOptions {
  
  @scala.inline
  def apply(publicKey: PublicKeyCredentialCreationOptions = null, signal: AbortSignal = null): CredentialCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialCreationOptions]
  }
}
