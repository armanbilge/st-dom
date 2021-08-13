package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTrackCapabilities extends StObject {
  
  var aspectRatio: js.UndefOr[DoubleRange] = js.native
  
  var autoGainControl: js.UndefOr[js.Array[scala.Boolean]] = js.native
  
  var channelCount: js.UndefOr[ULongRange] = js.native
  
  var deviceId: js.UndefOr[java.lang.String] = js.native
  
  var echoCancellation: js.UndefOr[js.Array[scala.Boolean]] = js.native
  
  var facingMode: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var frameRate: js.UndefOr[DoubleRange] = js.native
  
  var groupId: js.UndefOr[java.lang.String] = js.native
  
  var height: js.UndefOr[ULongRange] = js.native
  
  var latency: js.UndefOr[DoubleRange] = js.native
  
  var noiseSuppression: js.UndefOr[js.Array[scala.Boolean]] = js.native
  
  var resizeMode: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var sampleRate: js.UndefOr[ULongRange] = js.native
  
  var sampleSize: js.UndefOr[ULongRange] = js.native
  
  var width: js.UndefOr[ULongRange] = js.native
}
object MediaTrackCapabilities {
  
  @scala.inline
  def apply(
    aspectRatio: DoubleRange = null,
    autoGainControl: js.Array[scala.Boolean] = null,
    channelCount: ULongRange = null,
    deviceId: java.lang.String = null,
    echoCancellation: js.Array[scala.Boolean] = null,
    facingMode: js.Array[java.lang.String] = null,
    frameRate: DoubleRange = null,
    groupId: java.lang.String = null,
    height: ULongRange = null,
    latency: DoubleRange = null,
    noiseSuppression: js.Array[scala.Boolean] = null,
    resizeMode: js.Array[java.lang.String] = null,
    sampleRate: ULongRange = null,
    sampleSize: ULongRange = null,
    width: ULongRange = null
  ): MediaTrackCapabilities = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (autoGainControl != null) __obj.updateDynamic("autoGainControl")(autoGainControl.asInstanceOf[js.Any])
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (echoCancellation != null) __obj.updateDynamic("echoCancellation")(echoCancellation.asInstanceOf[js.Any])
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (noiseSuppression != null) __obj.updateDynamic("noiseSuppression")(noiseSuppression.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
}
