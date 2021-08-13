package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechRecognitionEventInit
  extends StObject
     with EventInit {
  
  var resultIndex: js.UndefOr[Double] = js.native
  
  var results: SpeechRecognitionResultList = js.native
}
object SpeechRecognitionEventInit {
  
  @scala.inline
  def apply(
    results: SpeechRecognitionResultList,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    resultIndex: js.UndefOr[Double] = js.undefined
  ): SpeechRecognitionEventInit = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (!js.isUndefined(resultIndex)) __obj.updateDynamic("resultIndex")(resultIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionEventInit]
  }
}
