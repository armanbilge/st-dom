package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Speech API interface represents a voice that the system supports. Every SpeechSynthesisVoice has its own relative speech service including information about language, name and URI. */
@js.native
trait SpeechSynthesisVoice extends StObject {
  
  val default: scala.Boolean = js.native
  
  val lang: java.lang.String = js.native
  
  val localService: scala.Boolean = js.native
  
  val name: java.lang.String = js.native
  
  val voiceURI: java.lang.String = js.native
}
object SpeechSynthesisVoice {
  
  @scala.inline
  def apply(
    default: scala.Boolean,
    lang: java.lang.String,
    localService: scala.Boolean,
    name: java.lang.String,
    voiceURI: java.lang.String
  ): SpeechSynthesisVoice = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], localService = localService.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], voiceURI = voiceURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisVoice]
  }
}
