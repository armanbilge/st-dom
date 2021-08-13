package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceGatherOptions extends StObject {
  
  var gatherPolicy: js.UndefOr[RTCIceGatherPolicy] = js.native
  
  var iceservers: js.UndefOr[js.Array[RTCIceServer]] = js.native
}
object RTCIceGatherOptions {
  
  @scala.inline
  def apply(gatherPolicy: RTCIceGatherPolicy = null, iceservers: js.Array[RTCIceServer] = null): RTCIceGatherOptions = {
    val __obj = js.Dynamic.literal()
    if (gatherPolicy != null) __obj.updateDynamic("gatherPolicy")(gatherPolicy.asInstanceOf[js.Any])
    if (iceservers != null) __obj.updateDynamic("iceservers")(iceservers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceGatherOptions]
  }
}
