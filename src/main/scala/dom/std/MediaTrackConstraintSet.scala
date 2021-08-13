package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTrackConstraintSet extends StObject {
  
  var aspectRatio: js.UndefOr[ConstrainDouble] = js.native
  
  var autoGainControl: js.UndefOr[ConstrainBoolean] = js.native
  
  var channelCount: js.UndefOr[ConstrainULong] = js.native
  
  var deviceId: js.UndefOr[ConstrainDOMString] = js.native
  
  var echoCancellation: js.UndefOr[ConstrainBoolean] = js.native
  
  var facingMode: js.UndefOr[ConstrainDOMString] = js.native
  
  var frameRate: js.UndefOr[ConstrainDouble] = js.native
  
  var groupId: js.UndefOr[ConstrainDOMString] = js.native
  
  var height: js.UndefOr[ConstrainULong] = js.native
  
  var latency: js.UndefOr[ConstrainDouble] = js.native
  
  var noiseSuppression: js.UndefOr[ConstrainBoolean] = js.native
  
  var resizeMode: js.UndefOr[ConstrainDOMString] = js.native
  
  var sampleRate: js.UndefOr[ConstrainULong] = js.native
  
  var sampleSize: js.UndefOr[ConstrainULong] = js.native
  
  var width: js.UndefOr[ConstrainULong] = js.native
}
object MediaTrackConstraintSet {
  
  @scala.inline
  def apply(
    aspectRatio: ConstrainDouble = null,
    autoGainControl: ConstrainBoolean = null,
    channelCount: ConstrainULong = null,
    deviceId: ConstrainDOMString = null,
    echoCancellation: ConstrainBoolean = null,
    facingMode: ConstrainDOMString = null,
    frameRate: ConstrainDouble = null,
    groupId: ConstrainDOMString = null,
    height: ConstrainULong = null,
    latency: ConstrainDouble = null,
    noiseSuppression: ConstrainBoolean = null,
    resizeMode: ConstrainDOMString = null,
    sampleRate: ConstrainULong = null,
    sampleSize: ConstrainULong = null,
    width: ConstrainULong = null
  ): MediaTrackConstraintSet = {
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
    __obj.asInstanceOf[MediaTrackConstraintSet]
  }
}
