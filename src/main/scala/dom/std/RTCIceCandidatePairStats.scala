package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceCandidatePairStats
  extends StObject
     with RTCStats {
  
  var availableIncomingBitrate: js.UndefOr[Double] = js.native
  
  var availableOutgoingBitrate: js.UndefOr[Double] = js.native
  
  var bytesDiscardedOnSend: js.UndefOr[Double] = js.native
  
  var bytesReceived: js.UndefOr[Double] = js.native
  
  var bytesSent: js.UndefOr[Double] = js.native
  
  var circuitBreakerTriggerCount: js.UndefOr[Double] = js.native
  
  var consentExpiredTimestamp: js.UndefOr[Double] = js.native
  
  var consentRequestsSent: js.UndefOr[Double] = js.native
  
  var currentRoundTripTime: js.UndefOr[Double] = js.native
  
  var currentRtt: js.UndefOr[Double] = js.native
  
  var firstRequestTimestamp: js.UndefOr[Double] = js.native
  
  var lastPacketReceivedTimestamp: js.UndefOr[Double] = js.native
  
  var lastPacketSentTimestamp: js.UndefOr[Double] = js.native
  
  var lastRequestTimestamp: js.UndefOr[Double] = js.native
  
  var lastResponseTimestamp: js.UndefOr[Double] = js.native
  
  var localCandidateId: js.UndefOr[java.lang.String] = js.native
  
  var nominated: js.UndefOr[scala.Boolean] = js.native
  
  var packetsDiscardedOnSend: js.UndefOr[Double] = js.native
  
  var packetsReceived: js.UndefOr[Double] = js.native
  
  var packetsSent: js.UndefOr[Double] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var remoteCandidateId: js.UndefOr[java.lang.String] = js.native
  
  var requestsReceived: js.UndefOr[Double] = js.native
  
  var requestsSent: js.UndefOr[Double] = js.native
  
  var responsesReceived: js.UndefOr[Double] = js.native
  
  var responsesSent: js.UndefOr[Double] = js.native
  
  var retransmissionsReceived: js.UndefOr[Double] = js.native
  
  var retransmissionsSent: js.UndefOr[Double] = js.native
  
  var state: js.UndefOr[RTCStatsIceCandidatePairState] = js.native
  
  var totalRoundTripTime: js.UndefOr[Double] = js.native
  
  var totalRtt: js.UndefOr[Double] = js.native
  
  var transportId: js.UndefOr[java.lang.String] = js.native
}
object RTCIceCandidatePairStats {
  
  @scala.inline
  def apply(
    availableIncomingBitrate: js.UndefOr[Double] = js.undefined,
    availableOutgoingBitrate: js.UndefOr[Double] = js.undefined,
    bytesDiscardedOnSend: js.UndefOr[Double] = js.undefined,
    bytesReceived: js.UndefOr[Double] = js.undefined,
    bytesSent: js.UndefOr[Double] = js.undefined,
    circuitBreakerTriggerCount: js.UndefOr[Double] = js.undefined,
    consentExpiredTimestamp: js.UndefOr[Double] = js.undefined,
    consentRequestsSent: js.UndefOr[Double] = js.undefined,
    currentRoundTripTime: js.UndefOr[Double] = js.undefined,
    currentRtt: js.UndefOr[Double] = js.undefined,
    firstRequestTimestamp: js.UndefOr[Double] = js.undefined,
    id: java.lang.String = null,
    lastPacketReceivedTimestamp: js.UndefOr[Double] = js.undefined,
    lastPacketSentTimestamp: js.UndefOr[Double] = js.undefined,
    lastRequestTimestamp: js.UndefOr[Double] = js.undefined,
    lastResponseTimestamp: js.UndefOr[Double] = js.undefined,
    localCandidateId: java.lang.String = null,
    nominated: js.UndefOr[scala.Boolean] = js.undefined,
    packetsDiscardedOnSend: js.UndefOr[Double] = js.undefined,
    packetsReceived: js.UndefOr[Double] = js.undefined,
    packetsSent: js.UndefOr[Double] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    remoteCandidateId: java.lang.String = null,
    requestsReceived: js.UndefOr[Double] = js.undefined,
    requestsSent: js.UndefOr[Double] = js.undefined,
    responsesReceived: js.UndefOr[Double] = js.undefined,
    responsesSent: js.UndefOr[Double] = js.undefined,
    retransmissionsReceived: js.UndefOr[Double] = js.undefined,
    retransmissionsSent: js.UndefOr[Double] = js.undefined,
    state: RTCStatsIceCandidatePairState = null,
    timestamp: js.UndefOr[Double] = js.undefined,
    totalRoundTripTime: js.UndefOr[Double] = js.undefined,
    totalRtt: js.UndefOr[Double] = js.undefined,
    transportId: java.lang.String = null,
    `type`: RTCStatsType = null
  ): RTCIceCandidatePairStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(availableIncomingBitrate)) __obj.updateDynamic("availableIncomingBitrate")(availableIncomingBitrate.asInstanceOf[js.Any])
    if (!js.isUndefined(availableOutgoingBitrate)) __obj.updateDynamic("availableOutgoingBitrate")(availableOutgoingBitrate.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesDiscardedOnSend)) __obj.updateDynamic("bytesDiscardedOnSend")(bytesDiscardedOnSend.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesReceived)) __obj.updateDynamic("bytesReceived")(bytesReceived.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesSent)) __obj.updateDynamic("bytesSent")(bytesSent.asInstanceOf[js.Any])
    if (!js.isUndefined(circuitBreakerTriggerCount)) __obj.updateDynamic("circuitBreakerTriggerCount")(circuitBreakerTriggerCount.asInstanceOf[js.Any])
    if (!js.isUndefined(consentExpiredTimestamp)) __obj.updateDynamic("consentExpiredTimestamp")(consentExpiredTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(consentRequestsSent)) __obj.updateDynamic("consentRequestsSent")(consentRequestsSent.asInstanceOf[js.Any])
    if (!js.isUndefined(currentRoundTripTime)) __obj.updateDynamic("currentRoundTripTime")(currentRoundTripTime.asInstanceOf[js.Any])
    if (!js.isUndefined(currentRtt)) __obj.updateDynamic("currentRtt")(currentRtt.asInstanceOf[js.Any])
    if (!js.isUndefined(firstRequestTimestamp)) __obj.updateDynamic("firstRequestTimestamp")(firstRequestTimestamp.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(lastPacketReceivedTimestamp)) __obj.updateDynamic("lastPacketReceivedTimestamp")(lastPacketReceivedTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(lastPacketSentTimestamp)) __obj.updateDynamic("lastPacketSentTimestamp")(lastPacketSentTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(lastRequestTimestamp)) __obj.updateDynamic("lastRequestTimestamp")(lastRequestTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(lastResponseTimestamp)) __obj.updateDynamic("lastResponseTimestamp")(lastResponseTimestamp.asInstanceOf[js.Any])
    if (localCandidateId != null) __obj.updateDynamic("localCandidateId")(localCandidateId.asInstanceOf[js.Any])
    if (!js.isUndefined(nominated)) __obj.updateDynamic("nominated")(nominated.asInstanceOf[js.Any])
    if (!js.isUndefined(packetsDiscardedOnSend)) __obj.updateDynamic("packetsDiscardedOnSend")(packetsDiscardedOnSend.asInstanceOf[js.Any])
    if (!js.isUndefined(packetsReceived)) __obj.updateDynamic("packetsReceived")(packetsReceived.asInstanceOf[js.Any])
    if (!js.isUndefined(packetsSent)) __obj.updateDynamic("packetsSent")(packetsSent.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (remoteCandidateId != null) __obj.updateDynamic("remoteCandidateId")(remoteCandidateId.asInstanceOf[js.Any])
    if (!js.isUndefined(requestsReceived)) __obj.updateDynamic("requestsReceived")(requestsReceived.asInstanceOf[js.Any])
    if (!js.isUndefined(requestsSent)) __obj.updateDynamic("requestsSent")(requestsSent.asInstanceOf[js.Any])
    if (!js.isUndefined(responsesReceived)) __obj.updateDynamic("responsesReceived")(responsesReceived.asInstanceOf[js.Any])
    if (!js.isUndefined(responsesSent)) __obj.updateDynamic("responsesSent")(responsesSent.asInstanceOf[js.Any])
    if (!js.isUndefined(retransmissionsReceived)) __obj.updateDynamic("retransmissionsReceived")(retransmissionsReceived.asInstanceOf[js.Any])
    if (!js.isUndefined(retransmissionsSent)) __obj.updateDynamic("retransmissionsSent")(retransmissionsSent.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(totalRoundTripTime)) __obj.updateDynamic("totalRoundTripTime")(totalRoundTripTime.asInstanceOf[js.Any])
    if (!js.isUndefined(totalRtt)) __obj.updateDynamic("totalRtt")(totalRtt.asInstanceOf[js.Any])
    if (transportId != null) __obj.updateDynamic("transportId")(transportId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidatePairStats]
  }
}
