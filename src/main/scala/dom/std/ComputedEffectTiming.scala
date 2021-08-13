package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputedEffectTiming
  extends StObject
     with EffectTiming {
  
  var activeDuration: js.UndefOr[Double] = js.native
  
  var currentIteration: js.UndefOr[Double | Null] = js.native
  
  var endTime: js.UndefOr[Double] = js.native
  
  var localTime: js.UndefOr[Double | Null] = js.native
  
  var progress: js.UndefOr[Double | Null] = js.native
}
object ComputedEffectTiming {
  
  @scala.inline
  def apply(
    activeDuration: js.UndefOr[Double] = js.undefined,
    currentIteration: js.UndefOr[Null | Double] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    direction: PlaybackDirection = null,
    duration: Double | java.lang.String = null,
    easing: java.lang.String = null,
    endDelay: js.UndefOr[Double] = js.undefined,
    endTime: js.UndefOr[Double] = js.undefined,
    fill: FillMode = null,
    iterationStart: js.UndefOr[Double] = js.undefined,
    iterations: js.UndefOr[Double] = js.undefined,
    localTime: js.UndefOr[Null | Double] = js.undefined,
    progress: js.UndefOr[Null | Double] = js.undefined
  ): ComputedEffectTiming = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeDuration)) __obj.updateDynamic("activeDuration")(activeDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(currentIteration)) __obj.updateDynamic("currentIteration")(currentIteration.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(endDelay)) __obj.updateDynamic("endDelay")(endDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(endTime)) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(iterationStart)) __obj.updateDynamic("iterationStart")(iterationStart.asInstanceOf[js.Any])
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (!js.isUndefined(localTime)) __obj.updateDynamic("localTime")(localTime.asInstanceOf[js.Any])
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedEffectTiming]
  }
}
