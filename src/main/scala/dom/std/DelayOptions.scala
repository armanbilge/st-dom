package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelayOptions
  extends StObject
     with AudioNodeOptions {
  
  var delayTime: js.UndefOr[Double] = js.native
  
  var maxDelayTime: js.UndefOr[Double] = js.native
}
object DelayOptions {
  
  @scala.inline
  def apply(
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    delayTime: js.UndefOr[Double] = js.undefined,
    maxDelayTime: js.UndefOr[Double] = js.undefined
  ): DelayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(delayTime)) __obj.updateDynamic("delayTime")(delayTime.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDelayTime)) __obj.updateDynamic("maxDelayTime")(maxDelayTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelayOptions]
  }
}
