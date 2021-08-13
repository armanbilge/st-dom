package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCTransportStats
  extends StObject
     with RTCStats {
  
  var bytesReceived: js.UndefOr[Double] = js.native
  
  var bytesSent: js.UndefOr[Double] = js.native
  
  var dtlsCipher: js.UndefOr[java.lang.String] = js.native
  
  var dtlsState: js.UndefOr[RTCDtlsTransportState] = js.native
  
  var iceRole: js.UndefOr[RTCIceRole] = js.native
  
  var localCertificateId: js.UndefOr[java.lang.String] = js.native
  
  var packetsReceived: js.UndefOr[Double] = js.native
  
  var packetsSent: js.UndefOr[Double] = js.native
  
  var remoteCertificateId: js.UndefOr[java.lang.String] = js.native
  
  var rtcpTransportStatsId: js.UndefOr[java.lang.String] = js.native
  
  var selectedCandidatePairChanges: js.UndefOr[Double] = js.native
  
  var selectedCandidatePairId: js.UndefOr[java.lang.String] = js.native
  
  var srtpCipher: js.UndefOr[java.lang.String] = js.native
  
  var tlsGroup: js.UndefOr[java.lang.String] = js.native
  
  var tlsVersion: js.UndefOr[java.lang.String] = js.native
}
object RTCTransportStats {
  
  @scala.inline
  def apply(
    bytesReceived: js.UndefOr[Double] = js.undefined,
    bytesSent: js.UndefOr[Double] = js.undefined,
    dtlsCipher: java.lang.String = null,
    dtlsState: RTCDtlsTransportState = null,
    iceRole: RTCIceRole = null,
    id: java.lang.String = null,
    localCertificateId: java.lang.String = null,
    packetsReceived: js.UndefOr[Double] = js.undefined,
    packetsSent: js.UndefOr[Double] = js.undefined,
    remoteCertificateId: java.lang.String = null,
    rtcpTransportStatsId: java.lang.String = null,
    selectedCandidatePairChanges: js.UndefOr[Double] = js.undefined,
    selectedCandidatePairId: java.lang.String = null,
    srtpCipher: java.lang.String = null,
    timestamp: js.UndefOr[Double] = js.undefined,
    tlsGroup: java.lang.String = null,
    tlsVersion: java.lang.String = null,
    `type`: RTCStatsType = null
  ): RTCTransportStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bytesReceived)) __obj.updateDynamic("bytesReceived")(bytesReceived.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesSent)) __obj.updateDynamic("bytesSent")(bytesSent.asInstanceOf[js.Any])
    if (dtlsCipher != null) __obj.updateDynamic("dtlsCipher")(dtlsCipher.asInstanceOf[js.Any])
    if (dtlsState != null) __obj.updateDynamic("dtlsState")(dtlsState.asInstanceOf[js.Any])
    if (iceRole != null) __obj.updateDynamic("iceRole")(iceRole.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (localCertificateId != null) __obj.updateDynamic("localCertificateId")(localCertificateId.asInstanceOf[js.Any])
    if (!js.isUndefined(packetsReceived)) __obj.updateDynamic("packetsReceived")(packetsReceived.asInstanceOf[js.Any])
    if (!js.isUndefined(packetsSent)) __obj.updateDynamic("packetsSent")(packetsSent.asInstanceOf[js.Any])
    if (remoteCertificateId != null) __obj.updateDynamic("remoteCertificateId")(remoteCertificateId.asInstanceOf[js.Any])
    if (rtcpTransportStatsId != null) __obj.updateDynamic("rtcpTransportStatsId")(rtcpTransportStatsId.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedCandidatePairChanges)) __obj.updateDynamic("selectedCandidatePairChanges")(selectedCandidatePairChanges.asInstanceOf[js.Any])
    if (selectedCandidatePairId != null) __obj.updateDynamic("selectedCandidatePairId")(selectedCandidatePairId.asInstanceOf[js.Any])
    if (srtpCipher != null) __obj.updateDynamic("srtpCipher")(srtpCipher.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (tlsGroup != null) __obj.updateDynamic("tlsGroup")(tlsGroup.asInstanceOf[js.Any])
    if (tlsVersion != null) __obj.updateDynamic("tlsVersion")(tlsVersion.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTransportStats]
  }
}
