package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcatParams
  extends StObject
     with Algorithm {
  
  var algorithmId: Uint8Array = js.native
  
  var hash: js.UndefOr[java.lang.String | Algorithm] = js.native
  
  var partyUInfo: Uint8Array = js.native
  
  var partyVInfo: Uint8Array = js.native
  
  var privateInfo: js.UndefOr[Uint8Array] = js.native
  
  var publicInfo: js.UndefOr[Uint8Array] = js.native
}
object ConcatParams {
  
  @scala.inline
  def apply(
    algorithmId: Uint8Array,
    name: java.lang.String,
    partyUInfo: Uint8Array,
    partyVInfo: Uint8Array,
    hash: java.lang.String | Algorithm = null,
    privateInfo: Uint8Array = null,
    publicInfo: Uint8Array = null
  ): ConcatParams = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partyUInfo = partyUInfo.asInstanceOf[js.Any], partyVInfo = partyVInfo.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (privateInfo != null) __obj.updateDynamic("privateInfo")(privateInfo.asInstanceOf[js.Any])
    if (publicInfo != null) __obj.updateDynamic("publicInfo")(publicInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatParams]
  }
}
