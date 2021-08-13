package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTrackSettings extends StObject {
  
  var aspectRatio: js.UndefOr[Double] = js.native
  
  var autoGainControl: js.UndefOr[scala.Boolean] = js.native
  
  var channelCount: js.UndefOr[Double] = js.native
  
  var deviceId: js.UndefOr[java.lang.String] = js.native
  
  var echoCancellation: js.UndefOr[scala.Boolean] = js.native
  
  var facingMode: js.UndefOr[java.lang.String] = js.native
  
  var frameRate: js.UndefOr[Double] = js.native
  
  var groupId: js.UndefOr[java.lang.String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var latency: js.UndefOr[Double] = js.native
  
  var noiseSuppression: js.UndefOr[scala.Boolean] = js.native
  
  var resizeMode: js.UndefOr[java.lang.String] = js.native
  
  var sampleRate: js.UndefOr[Double] = js.native
  
  var sampleSize: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object MediaTrackSettings {
  
  @scala.inline
  def apply(
    aspectRatio: js.UndefOr[Double] = js.undefined,
    autoGainControl: js.UndefOr[scala.Boolean] = js.undefined,
    channelCount: js.UndefOr[Double] = js.undefined,
    deviceId: java.lang.String = null,
    echoCancellation: js.UndefOr[scala.Boolean] = js.undefined,
    facingMode: java.lang.String = null,
    frameRate: js.UndefOr[Double] = js.undefined,
    groupId: java.lang.String = null,
    height: js.UndefOr[Double] = js.undefined,
    latency: js.UndefOr[Double] = js.undefined,
    noiseSuppression: js.UndefOr[scala.Boolean] = js.undefined,
    resizeMode: java.lang.String = null,
    sampleRate: js.UndefOr[Double] = js.undefined,
    sampleSize: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): MediaTrackSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGainControl)) __obj.updateDynamic("autoGainControl")(autoGainControl.asInstanceOf[js.Any])
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (!js.isUndefined(echoCancellation)) __obj.updateDynamic("echoCancellation")(echoCancellation.asInstanceOf[js.Any])
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(frameRate)) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(latency)) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (!js.isUndefined(noiseSuppression)) __obj.updateDynamic("noiseSuppression")(noiseSuppression.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleSize)) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackSettings]
  }
}
