package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechSynthesisErrorEventInit
  extends StObject
     with SpeechSynthesisEventInit {
  
  var error: SpeechSynthesisErrorCode = js.native
}
object SpeechSynthesisErrorEventInit {
  
  @scala.inline
  def apply(
    error: SpeechSynthesisErrorCode,
    utterance: SpeechSynthesisUtterance,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    charIndex: js.UndefOr[Double] = js.undefined,
    charLength: js.UndefOr[Double] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    elapsedTime: js.UndefOr[Double] = js.undefined,
    name: java.lang.String = null
  ): SpeechSynthesisErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], utterance = utterance.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(charIndex)) __obj.updateDynamic("charIndex")(charIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(charLength)) __obj.updateDynamic("charLength")(charLength.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (!js.isUndefined(elapsedTime)) __obj.updateDynamic("elapsedTime")(elapsedTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisErrorEventInit]
  }
}
