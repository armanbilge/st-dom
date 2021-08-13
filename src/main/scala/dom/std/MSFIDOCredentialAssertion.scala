package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSFIDOCredentialAssertion
  extends StObject
     with MSAssertion {
  
  val algorithm: java.lang.String | Algorithm = js.native
  
  val attestation: js.Any = js.native
  
  val publicKey: java.lang.String = js.native
  
  val transportHints: js.Array[MSTransportType] = js.native
}
object MSFIDOCredentialAssertion {
  
  @scala.inline
  def apply(
    algorithm: java.lang.String | Algorithm,
    attestation: js.Any,
    id: java.lang.String,
    publicKey: java.lang.String,
    transportHints: js.Array[MSTransportType],
    `type`: MSCredentialType
  ): MSFIDOCredentialAssertion = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], attestation = attestation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], transportHints = transportHints.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSFIDOCredentialAssertion]
  }
}
