package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A short audio asset residing in memory, created from an audio file using the AudioContext.decodeAudioData() method, or from raw data using AudioContext.createBuffer(). Once put into an AudioBuffer, the audio can then be played by being passed into an AudioBufferSourceNode. */
@js.native
trait AudioBuffer extends StObject {
  
  def copyFromChannel(destination: Float32Array, channelNumber: Double): Unit = js.native
  def copyFromChannel(destination: Float32Array, channelNumber: Double, bufferOffset: Double): Unit = js.native
  
  def copyToChannel(source: Float32Array, channelNumber: Double): Unit = js.native
  def copyToChannel(source: Float32Array, channelNumber: Double, bufferOffset: Double): Unit = js.native
  
  val duration: Double = js.native
  
  def getChannelData(channel: Double): Float32Array = js.native
  
  val length: Double = js.native
  
  val numberOfChannels: Double = js.native
  
  val sampleRate: Double = js.native
}
