package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationPlaybackEventInit
  extends StObject
     with EventInit {
  
  var currentTime: js.UndefOr[Double | Null] = js.native
  
  var timelineTime: js.UndefOr[Double | Null] = js.native
}
object AnimationPlaybackEventInit {
  
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    currentTime: js.UndefOr[Null | Double] = js.undefined,
    timelineTime: js.UndefOr[Null | Double] = js.undefined
  ): AnimationPlaybackEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (!js.isUndefined(currentTime)) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (!js.isUndefined(timelineTime)) __obj.updateDynamic("timelineTime")(timelineTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPlaybackEventInit]
  }
}
