package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicsCompressorOptions
  extends StObject
     with AudioNodeOptions {
  
  var attack: js.UndefOr[Double] = js.native
  
  var knee: js.UndefOr[Double] = js.native
  
  var ratio: js.UndefOr[Double] = js.native
  
  var release: js.UndefOr[Double] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
}
object DynamicsCompressorOptions {
  
  @scala.inline
  def apply(
    attack: js.UndefOr[Double] = js.undefined,
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    knee: js.UndefOr[Double] = js.undefined,
    ratio: js.UndefOr[Double] = js.undefined,
    release: js.UndefOr[Double] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined
  ): DynamicsCompressorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attack)) __obj.updateDynamic("attack")(attack.asInstanceOf[js.Any])
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(knee)) __obj.updateDynamic("knee")(knee.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (!js.isUndefined(release)) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicsCompressorOptions]
  }
}
