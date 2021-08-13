package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCMediaStreamTrackStats
  extends StObject
     with RTCStats {
  
  var audioLevel: js.UndefOr[Double] = js.native
  
  var echoReturnLoss: js.UndefOr[Double] = js.native
  
  var echoReturnLossEnhancement: js.UndefOr[Double] = js.native
  
  var frameHeight: js.UndefOr[Double] = js.native
  
  var frameWidth: js.UndefOr[Double] = js.native
  
  var framesCorrupted: js.UndefOr[Double] = js.native
  
  var framesDecoded: js.UndefOr[Double] = js.native
  
  var framesDropped: js.UndefOr[Double] = js.native
  
  var framesPerSecond: js.UndefOr[Double] = js.native
  
  var framesReceived: js.UndefOr[Double] = js.native
  
  var framesSent: js.UndefOr[Double] = js.native
  
  var remoteSource: js.UndefOr[scala.Boolean] = js.native
  
  var ssrcIds: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var trackIdentifier: js.UndefOr[java.lang.String] = js.native
}
object RTCMediaStreamTrackStats {
  
  @scala.inline
  def apply(
    audioLevel: js.UndefOr[Double] = js.undefined,
    echoReturnLoss: js.UndefOr[Double] = js.undefined,
    echoReturnLossEnhancement: js.UndefOr[Double] = js.undefined,
    frameHeight: js.UndefOr[Double] = js.undefined,
    frameWidth: js.UndefOr[Double] = js.undefined,
    framesCorrupted: js.UndefOr[Double] = js.undefined,
    framesDecoded: js.UndefOr[Double] = js.undefined,
    framesDropped: js.UndefOr[Double] = js.undefined,
    framesPerSecond: js.UndefOr[Double] = js.undefined,
    framesReceived: js.UndefOr[Double] = js.undefined,
    framesSent: js.UndefOr[Double] = js.undefined,
    id: java.lang.String = null,
    remoteSource: js.UndefOr[scala.Boolean] = js.undefined,
    ssrcIds: js.Array[java.lang.String] = null,
    timestamp: js.UndefOr[Double] = js.undefined,
    trackIdentifier: java.lang.String = null,
    `type`: RTCStatsType = null
  ): RTCMediaStreamTrackStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audioLevel)) __obj.updateDynamic("audioLevel")(audioLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(echoReturnLoss)) __obj.updateDynamic("echoReturnLoss")(echoReturnLoss.asInstanceOf[js.Any])
    if (!js.isUndefined(echoReturnLossEnhancement)) __obj.updateDynamic("echoReturnLossEnhancement")(echoReturnLossEnhancement.asInstanceOf[js.Any])
    if (!js.isUndefined(frameHeight)) __obj.updateDynamic("frameHeight")(frameHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(frameWidth)) __obj.updateDynamic("frameWidth")(frameWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(framesCorrupted)) __obj.updateDynamic("framesCorrupted")(framesCorrupted.asInstanceOf[js.Any])
    if (!js.isUndefined(framesDecoded)) __obj.updateDynamic("framesDecoded")(framesDecoded.asInstanceOf[js.Any])
    if (!js.isUndefined(framesDropped)) __obj.updateDynamic("framesDropped")(framesDropped.asInstanceOf[js.Any])
    if (!js.isUndefined(framesPerSecond)) __obj.updateDynamic("framesPerSecond")(framesPerSecond.asInstanceOf[js.Any])
    if (!js.isUndefined(framesReceived)) __obj.updateDynamic("framesReceived")(framesReceived.asInstanceOf[js.Any])
    if (!js.isUndefined(framesSent)) __obj.updateDynamic("framesSent")(framesSent.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteSource)) __obj.updateDynamic("remoteSource")(remoteSource.asInstanceOf[js.Any])
    if (ssrcIds != null) __obj.updateDynamic("ssrcIds")(ssrcIds.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (trackIdentifier != null) __obj.updateDynamic("trackIdentifier")(trackIdentifier.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCMediaStreamTrackStats]
  }
}
