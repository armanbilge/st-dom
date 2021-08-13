package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyCredentialParameters extends StObject {
  
  var alg: COSEAlgorithmIdentifier = js.native
  
  var `type`: PublicKeyCredentialType = js.native
}
object PublicKeyCredentialParameters {
  
  @scala.inline
  def apply(alg: COSEAlgorithmIdentifier, `type`: PublicKeyCredentialType): PublicKeyCredentialParameters = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialParameters]
  }
}
