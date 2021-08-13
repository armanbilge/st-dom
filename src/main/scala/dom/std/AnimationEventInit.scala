package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEventInit
  extends StObject
     with EventInit {
  
  var animationName: js.UndefOr[java.lang.String] = js.native
  
  var elapsedTime: js.UndefOr[Double] = js.native
  
  var pseudoElement: js.UndefOr[java.lang.String] = js.native
}
object AnimationEventInit {
  
  @scala.inline
  def apply(
    animationName: java.lang.String = null,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    elapsedTime: js.UndefOr[Double] = js.undefined,
    pseudoElement: java.lang.String = null
  ): AnimationEventInit = {
    val __obj = js.Dynamic.literal()
    if (animationName != null) __obj.updateDynamic("animationName")(animationName.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (!js.isUndefined(elapsedTime)) __obj.updateDynamic("elapsedTime")(elapsedTime.asInstanceOf[js.Any])
    if (pseudoElement != null) __obj.updateDynamic("pseudoElement")(pseudoElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEventInit]
  }
}
