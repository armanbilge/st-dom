package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCErrorInit extends StObject {
  
  var errorDetail: RTCErrorDetailType = js.native
  
  var receivedAlert: js.UndefOr[Double] = js.native
  
  var sctpCauseCode: js.UndefOr[Double] = js.native
  
  var sdpLineNumber: js.UndefOr[Double] = js.native
  
  var sentAlert: js.UndefOr[Double] = js.native
}
object RTCErrorInit {
  
  @scala.inline
  def apply(
    errorDetail: RTCErrorDetailType,
    receivedAlert: js.UndefOr[Double] = js.undefined,
    sctpCauseCode: js.UndefOr[Double] = js.undefined,
    sdpLineNumber: js.UndefOr[Double] = js.undefined,
    sentAlert: js.UndefOr[Double] = js.undefined
  ): RTCErrorInit = {
    val __obj = js.Dynamic.literal(errorDetail = errorDetail.asInstanceOf[js.Any])
    if (!js.isUndefined(receivedAlert)) __obj.updateDynamic("receivedAlert")(receivedAlert.asInstanceOf[js.Any])
    if (!js.isUndefined(sctpCauseCode)) __obj.updateDynamic("sctpCauseCode")(sctpCauseCode.asInstanceOf[js.Any])
    if (!js.isUndefined(sdpLineNumber)) __obj.updateDynamic("sdpLineNumber")(sdpLineNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(sentAlert)) __obj.updateDynamic("sentAlert")(sentAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCErrorInit]
  }
}
