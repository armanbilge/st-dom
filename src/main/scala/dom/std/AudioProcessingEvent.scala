package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Web Audio API events that occur when a ScriptProcessorNode input buffer is ready to be processed.
  * @deprecated As of the August 29 2014 Web Audio API spec publication, this feature has been marked as deprecated, and is soon to be replaced by AudioWorklet.
  */
@js.native
trait AudioProcessingEvent
  extends StObject
     with Event {
  
  val inputBuffer: AudioBuffer = js.native
  
  val outputBuffer: AudioBuffer = js.native
  
  val playbackTime: Double = js.native
}
