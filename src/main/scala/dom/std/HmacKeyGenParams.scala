package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HmacKeyGenParams
  extends StObject
     with Algorithm {
  
  var hash: HashAlgorithmIdentifier = js.native
  
  var length: js.UndefOr[Double] = js.native
}
object HmacKeyGenParams {
  
  @scala.inline
  def apply(hash: HashAlgorithmIdentifier, name: java.lang.String, length: js.UndefOr[Double] = js.undefined): HmacKeyGenParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacKeyGenParams]
  }
}
