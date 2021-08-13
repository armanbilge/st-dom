package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTrackSupportedConstraints extends StObject {
  
  var aspectRatio: js.UndefOr[scala.Boolean] = js.native
  
  var autoGainControl: js.UndefOr[scala.Boolean] = js.native
  
  var channelCount: js.UndefOr[scala.Boolean] = js.native
  
  var deviceId: js.UndefOr[scala.Boolean] = js.native
  
  var echoCancellation: js.UndefOr[scala.Boolean] = js.native
  
  var facingMode: js.UndefOr[scala.Boolean] = js.native
  
  var frameRate: js.UndefOr[scala.Boolean] = js.native
  
  var groupId: js.UndefOr[scala.Boolean] = js.native
  
  var height: js.UndefOr[scala.Boolean] = js.native
  
  var latency: js.UndefOr[scala.Boolean] = js.native
  
  var noiseSuppression: js.UndefOr[scala.Boolean] = js.native
  
  var resizeMode: js.UndefOr[scala.Boolean] = js.native
  
  var sampleRate: js.UndefOr[scala.Boolean] = js.native
  
  var sampleSize: js.UndefOr[scala.Boolean] = js.native
  
  var width: js.UndefOr[scala.Boolean] = js.native
}
object MediaTrackSupportedConstraints {
  
  @scala.inline
  def apply(
    aspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    autoGainControl: js.UndefOr[scala.Boolean] = js.undefined,
    channelCount: js.UndefOr[scala.Boolean] = js.undefined,
    deviceId: js.UndefOr[scala.Boolean] = js.undefined,
    echoCancellation: js.UndefOr[scala.Boolean] = js.undefined,
    facingMode: js.UndefOr[scala.Boolean] = js.undefined,
    frameRate: js.UndefOr[scala.Boolean] = js.undefined,
    groupId: js.UndefOr[scala.Boolean] = js.undefined,
    height: js.UndefOr[scala.Boolean] = js.undefined,
    latency: js.UndefOr[scala.Boolean] = js.undefined,
    noiseSuppression: js.UndefOr[scala.Boolean] = js.undefined,
    resizeMode: js.UndefOr[scala.Boolean] = js.undefined,
    sampleRate: js.UndefOr[scala.Boolean] = js.undefined,
    sampleSize: js.UndefOr[scala.Boolean] = js.undefined,
    width: js.UndefOr[scala.Boolean] = js.undefined
  ): MediaTrackSupportedConstraints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGainControl)) __obj.updateDynamic("autoGainControl")(autoGainControl.asInstanceOf[js.Any])
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceId)) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (!js.isUndefined(echoCancellation)) __obj.updateDynamic("echoCancellation")(echoCancellation.asInstanceOf[js.Any])
    if (!js.isUndefined(facingMode)) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(frameRate)) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (!js.isUndefined(groupId)) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(latency)) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (!js.isUndefined(noiseSuppression)) __obj.updateDynamic("noiseSuppression")(noiseSuppression.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeMode)) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleSize)) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackSupportedConstraints]
  }
}
