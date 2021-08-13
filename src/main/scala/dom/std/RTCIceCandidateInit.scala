package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceCandidateInit extends StObject {
  
  var candidate: js.UndefOr[java.lang.String] = js.native
  
  var sdpMLineIndex: js.UndefOr[Double | Null] = js.native
  
  var sdpMid: js.UndefOr[java.lang.String | Null] = js.native
  
  var usernameFragment: js.UndefOr[java.lang.String | Null] = js.native
}
object RTCIceCandidateInit {
  
  @scala.inline
  def apply(
    candidate: java.lang.String = null,
    sdpMLineIndex: js.UndefOr[Null | Double] = js.undefined,
    sdpMid: js.UndefOr[Null | java.lang.String] = js.undefined,
    usernameFragment: js.UndefOr[Null | java.lang.String] = js.undefined
  ): RTCIceCandidateInit = {
    val __obj = js.Dynamic.literal()
    if (candidate != null) __obj.updateDynamic("candidate")(candidate.asInstanceOf[js.Any])
    if (!js.isUndefined(sdpMLineIndex)) __obj.updateDynamic("sdpMLineIndex")(sdpMLineIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(sdpMid)) __obj.updateDynamic("sdpMid")(sdpMid.asInstanceOf[js.Any])
    if (!js.isUndefined(usernameFragment)) __obj.updateDynamic("usernameFragment")(usernameFragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidateInit]
  }
}
