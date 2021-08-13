package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PannerOptions
  extends StObject
     with AudioNodeOptions {
  
  var coneInnerAngle: js.UndefOr[Double] = js.native
  
  var coneOuterAngle: js.UndefOr[Double] = js.native
  
  var coneOuterGain: js.UndefOr[Double] = js.native
  
  var distanceModel: js.UndefOr[DistanceModelType] = js.native
  
  var maxDistance: js.UndefOr[Double] = js.native
  
  var orientationX: js.UndefOr[Double] = js.native
  
  var orientationY: js.UndefOr[Double] = js.native
  
  var orientationZ: js.UndefOr[Double] = js.native
  
  var panningModel: js.UndefOr[PanningModelType] = js.native
  
  var positionX: js.UndefOr[Double] = js.native
  
  var positionY: js.UndefOr[Double] = js.native
  
  var positionZ: js.UndefOr[Double] = js.native
  
  var refDistance: js.UndefOr[Double] = js.native
  
  var rolloffFactor: js.UndefOr[Double] = js.native
}
object PannerOptions {
  
  @scala.inline
  def apply(
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    coneInnerAngle: js.UndefOr[Double] = js.undefined,
    coneOuterAngle: js.UndefOr[Double] = js.undefined,
    coneOuterGain: js.UndefOr[Double] = js.undefined,
    distanceModel: DistanceModelType = null,
    maxDistance: js.UndefOr[Double] = js.undefined,
    orientationX: js.UndefOr[Double] = js.undefined,
    orientationY: js.UndefOr[Double] = js.undefined,
    orientationZ: js.UndefOr[Double] = js.undefined,
    panningModel: PanningModelType = null,
    positionX: js.UndefOr[Double] = js.undefined,
    positionY: js.UndefOr[Double] = js.undefined,
    positionZ: js.UndefOr[Double] = js.undefined,
    refDistance: js.UndefOr[Double] = js.undefined,
    rolloffFactor: js.UndefOr[Double] = js.undefined
  ): PannerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(coneInnerAngle)) __obj.updateDynamic("coneInnerAngle")(coneInnerAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(coneOuterAngle)) __obj.updateDynamic("coneOuterAngle")(coneOuterAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(coneOuterGain)) __obj.updateDynamic("coneOuterGain")(coneOuterGain.asInstanceOf[js.Any])
    if (distanceModel != null) __obj.updateDynamic("distanceModel")(distanceModel.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDistance)) __obj.updateDynamic("maxDistance")(maxDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(orientationX)) __obj.updateDynamic("orientationX")(orientationX.asInstanceOf[js.Any])
    if (!js.isUndefined(orientationY)) __obj.updateDynamic("orientationY")(orientationY.asInstanceOf[js.Any])
    if (!js.isUndefined(orientationZ)) __obj.updateDynamic("orientationZ")(orientationZ.asInstanceOf[js.Any])
    if (panningModel != null) __obj.updateDynamic("panningModel")(panningModel.asInstanceOf[js.Any])
    if (!js.isUndefined(positionX)) __obj.updateDynamic("positionX")(positionX.asInstanceOf[js.Any])
    if (!js.isUndefined(positionY)) __obj.updateDynamic("positionY")(positionY.asInstanceOf[js.Any])
    if (!js.isUndefined(positionZ)) __obj.updateDynamic("positionZ")(positionZ.asInstanceOf[js.Any])
    if (!js.isUndefined(refDistance)) __obj.updateDynamic("refDistance")(refDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(rolloffFactor)) __obj.updateDynamic("rolloffFactor")(rolloffFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PannerOptions]
  }
}
