package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaHashedKeyAlgorithm
  extends StObject
     with RsaKeyAlgorithm {
  
  var hash: KeyAlgorithm = js.native
}
object RsaHashedKeyAlgorithm {
  
  @scala.inline
  def apply(hash: KeyAlgorithm, modulusLength: Double, name: java.lang.String, publicExponent: BigInteger): RsaHashedKeyAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaHashedKeyAlgorithm]
  }
}
