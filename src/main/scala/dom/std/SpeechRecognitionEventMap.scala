package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechRecognitionEventMap extends StObject {
  
  var audioend: Event = js.native
  
  var audiostart: Event = js.native
  
  var end: Event = js.native
  
  var error: SpeechRecognitionErrorEvent = js.native
  
  var nomatch: SpeechRecognitionEvent = js.native
  
  var result: SpeechRecognitionEvent = js.native
  
  var soundend: Event = js.native
  
  var soundstart: Event = js.native
  
  var speechend: Event = js.native
  
  var speechstart: Event = js.native
  
  var start: Event = js.native
}
object SpeechRecognitionEventMap {
  
  @scala.inline
  def apply(
    audioend: Event,
    audiostart: Event,
    end: Event,
    error: SpeechRecognitionErrorEvent,
    nomatch: SpeechRecognitionEvent,
    result: SpeechRecognitionEvent,
    soundend: Event,
    soundstart: Event,
    speechend: Event,
    speechstart: Event,
    start: Event
  ): SpeechRecognitionEventMap = {
    val __obj = js.Dynamic.literal(audioend = audioend.asInstanceOf[js.Any], audiostart = audiostart.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], nomatch = nomatch.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], soundend = soundend.asInstanceOf[js.Any], soundstart = soundstart.asInstanceOf[js.Any], speechend = speechend.asInstanceOf[js.Any], speechstart = speechstart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionEventMap]
  }
}
