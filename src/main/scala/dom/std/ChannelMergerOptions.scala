package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelMergerOptions
  extends StObject
     with AudioNodeOptions {
  
  var numberOfInputs: js.UndefOr[Double] = js.native
}
object ChannelMergerOptions {
  
  @scala.inline
  def apply(
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    numberOfInputs: js.UndefOr[Double] = js.undefined
  ): ChannelMergerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfInputs)) __obj.updateDynamic("numberOfInputs")(numberOfInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMergerOptions]
  }
}
