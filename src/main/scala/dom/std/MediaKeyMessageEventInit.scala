package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaKeyMessageEventInit
  extends StObject
     with EventInit {
  
  var message: ArrayBuffer = js.native
  
  var messageType: MediaKeyMessageType = js.native
}
object MediaKeyMessageEventInit {
  
  @scala.inline
  def apply(
    message: ArrayBuffer,
    messageType: MediaKeyMessageType,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): MediaKeyMessageEventInit = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeyMessageEventInit]
  }
}
