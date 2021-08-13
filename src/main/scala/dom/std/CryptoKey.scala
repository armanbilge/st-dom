package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The CryptoKey dictionary of the Web Crypto API represents a cryptographic key. */
@js.native
trait CryptoKey extends StObject {
  
  val algorithm: KeyAlgorithm = js.native
  
  val extractable: scala.Boolean = js.native
  
  val `type`: KeyType = js.native
  
  val usages: js.Array[KeyUsage] = js.native
}
object CryptoKey {
  
  @scala.inline
  def apply(algorithm: KeyAlgorithm, extractable: scala.Boolean, `type`: KeyType, usages: js.Array[KeyUsage]): CryptoKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
}
