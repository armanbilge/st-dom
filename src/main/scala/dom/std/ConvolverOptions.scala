package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvolverOptions
  extends StObject
     with AudioNodeOptions {
  
  var buffer: js.UndefOr[AudioBuffer | Null] = js.native
  
  var disableNormalization: js.UndefOr[scala.Boolean] = js.native
}
object ConvolverOptions {
  
  @scala.inline
  def apply(
    buffer: js.UndefOr[Null | AudioBuffer] = js.undefined,
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    disableNormalization: js.UndefOr[scala.Boolean] = js.undefined
  ): ConvolverOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNormalization)) __obj.updateDynamic("disableNormalization")(disableNormalization.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvolverOptions]
  }
}
