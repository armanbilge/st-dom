package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EcdsaParams
  extends StObject
     with Algorithm {
  
  var hash: HashAlgorithmIdentifier = js.native
}
object EcdsaParams {
  
  @scala.inline
  def apply(hash: HashAlgorithmIdentifier, name: java.lang.String): EcdsaParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcdsaParams]
  }
}
