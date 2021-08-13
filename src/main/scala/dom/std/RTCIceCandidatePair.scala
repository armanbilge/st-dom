package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceCandidatePair extends StObject {
  
  var local: js.UndefOr[RTCIceCandidate] = js.native
  
  var remote: js.UndefOr[RTCIceCandidate] = js.native
}
object RTCIceCandidatePair {
  
  @scala.inline
  def apply(local: RTCIceCandidate = null, remote: RTCIceCandidate = null): RTCIceCandidatePair = {
    val __obj = js.Dynamic.literal()
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidatePair]
  }
}
