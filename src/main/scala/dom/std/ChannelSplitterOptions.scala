package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelSplitterOptions
  extends StObject
     with AudioNodeOptions {
  
  var numberOfOutputs: js.UndefOr[Double] = js.native
}
object ChannelSplitterOptions {
  
  @scala.inline
  def apply(
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    numberOfOutputs: js.UndefOr[Double] = js.undefined
  ): ChannelSplitterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfOutputs)) __obj.updateDynamic("numberOfOutputs")(numberOfOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSplitterOptions]
  }
}
