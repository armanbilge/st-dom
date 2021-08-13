package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCPeerConnectionIceErrorEventInit
  extends StObject
     with EventInit {
  
  var address: js.UndefOr[java.lang.String | Null] = js.native
  
  var errorCode: Double = js.native
  
  var port: js.UndefOr[Double | Null] = js.native
  
  var statusText: js.UndefOr[java.lang.String] = js.native
  
  var url: js.UndefOr[java.lang.String] = js.native
}
object RTCPeerConnectionIceErrorEventInit {
  
  @scala.inline
  def apply(
    errorCode: Double,
    address: js.UndefOr[Null | java.lang.String] = js.undefined,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    port: js.UndefOr[Null | Double] = js.undefined,
    statusText: java.lang.String = null,
    url: java.lang.String = null
  ): RTCPeerConnectionIceErrorEventInit = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionIceErrorEventInit]
  }
}
