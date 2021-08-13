package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebRTC API interface manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection. */
@js.native
trait RTCRtpReceiver extends StObject {
  
  def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  
  def getParameters(): RTCRtpReceiveParameters = js.native
  
  def getStats(): js.Promise[RTCStatsReport] = js.native
  
  def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource] = js.native
  
  val track: MediaStreamTrack = js.native
  
  val transport: RTCDtlsTransport | Null = js.native
}
object RTCRtpReceiver {
  
  @scala.inline
  def apply(
    getContributingSources: () => js.Array[RTCRtpContributingSource],
    getParameters: () => RTCRtpReceiveParameters,
    getStats: () => js.Promise[RTCStatsReport],
    getSynchronizationSources: () => js.Array[RTCRtpSynchronizationSource],
    track: MediaStreamTrack,
    transport: RTCDtlsTransport = null
  ): RTCRtpReceiver = {
    val __obj = js.Dynamic.literal(getContributingSources = js.Any.fromFunction0(getContributingSources), getParameters = js.Any.fromFunction0(getParameters), getStats = js.Any.fromFunction0(getStats), getSynchronizationSources = js.Any.fromFunction0(getSynchronizationSources), track = track.asInstanceOf[js.Any])
    __obj.updateDynamic("transport")(if (transport != null) transport.asInstanceOf[RTCDtlsTransport].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[RTCRtpReceiver]
  }
}
