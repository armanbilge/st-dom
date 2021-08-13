package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionalEffectTiming extends StObject {
  
  var delay: js.UndefOr[Double] = js.native
  
  var direction: js.UndefOr[PlaybackDirection] = js.native
  
  var duration: js.UndefOr[Double | java.lang.String] = js.native
  
  var easing: js.UndefOr[java.lang.String] = js.native
  
  var endDelay: js.UndefOr[Double] = js.native
  
  var fill: js.UndefOr[FillMode] = js.native
  
  var iterationStart: js.UndefOr[Double] = js.native
  
  var iterations: js.UndefOr[Double] = js.native
}
object OptionalEffectTiming {
  
  @scala.inline
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    direction: PlaybackDirection = null,
    duration: Double | java.lang.String = null,
    easing: java.lang.String = null,
    endDelay: js.UndefOr[Double] = js.undefined,
    fill: FillMode = null,
    iterationStart: js.UndefOr[Double] = js.undefined,
    iterations: js.UndefOr[Double] = js.undefined
  ): OptionalEffectTiming = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(endDelay)) __obj.updateDynamic("endDelay")(endDelay.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(iterationStart)) __obj.updateDynamic("iterationStart")(iterationStart.asInstanceOf[js.Any])
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalEffectTiming]
  }
}
