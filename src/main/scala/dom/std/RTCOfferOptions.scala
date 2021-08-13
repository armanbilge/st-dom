package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCOfferOptions
  extends StObject
     with RTCOfferAnswerOptions {
  
  var iceRestart: js.UndefOr[scala.Boolean] = js.native
  
  var offerToReceiveAudio: js.UndefOr[scala.Boolean] = js.native
  
  var offerToReceiveVideo: js.UndefOr[scala.Boolean] = js.native
}
object RTCOfferOptions {
  
  @scala.inline
  def apply(
    iceRestart: js.UndefOr[scala.Boolean] = js.undefined,
    offerToReceiveAudio: js.UndefOr[scala.Boolean] = js.undefined,
    offerToReceiveVideo: js.UndefOr[scala.Boolean] = js.undefined
  ): RTCOfferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(iceRestart)) __obj.updateDynamic("iceRestart")(iceRestart.asInstanceOf[js.Any])
    if (!js.isUndefined(offerToReceiveAudio)) __obj.updateDynamic("offerToReceiveAudio")(offerToReceiveAudio.asInstanceOf[js.Any])
    if (!js.isUndefined(offerToReceiveVideo)) __obj.updateDynamic("offerToReceiveVideo")(offerToReceiveVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOfferOptions]
  }
}
