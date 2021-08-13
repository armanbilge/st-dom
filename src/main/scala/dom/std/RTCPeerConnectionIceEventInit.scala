package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCPeerConnectionIceEventInit
  extends StObject
     with EventInit {
  
  var candidate: js.UndefOr[RTCIceCandidate | Null] = js.native
  
  var url: js.UndefOr[java.lang.String | Null] = js.native
}
object RTCPeerConnectionIceEventInit {
  
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    candidate: js.UndefOr[Null | RTCIceCandidate] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    url: js.UndefOr[Null | java.lang.String] = js.undefined
  ): RTCPeerConnectionIceEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(candidate)) __obj.updateDynamic("candidate")(candidate.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (!js.isUndefined(url)) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionIceEventInit]
  }
}
