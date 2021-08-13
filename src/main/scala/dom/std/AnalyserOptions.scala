package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyserOptions
  extends StObject
     with AudioNodeOptions {
  
  var fftSize: js.UndefOr[Double] = js.native
  
  var maxDecibels: js.UndefOr[Double] = js.native
  
  var minDecibels: js.UndefOr[Double] = js.native
  
  var smoothingTimeConstant: js.UndefOr[Double] = js.native
}
object AnalyserOptions {
  
  @scala.inline
  def apply(
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    fftSize: js.UndefOr[Double] = js.undefined,
    maxDecibels: js.UndefOr[Double] = js.undefined,
    minDecibels: js.UndefOr[Double] = js.undefined,
    smoothingTimeConstant: js.UndefOr[Double] = js.undefined
  ): AnalyserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(fftSize)) __obj.updateDynamic("fftSize")(fftSize.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDecibels)) __obj.updateDynamic("maxDecibels")(maxDecibels.asInstanceOf[js.Any])
    if (!js.isUndefined(minDecibels)) __obj.updateDynamic("minDecibels")(minDecibels.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothingTimeConstant)) __obj.updateDynamic("smoothingTimeConstant")(smoothingTimeConstant.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyserOptions]
  }
}
