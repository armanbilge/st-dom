package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfflineAudioContextEventMap
  extends StObject
     with BaseAudioContextEventMap {
  
  var complete: OfflineAudioCompletionEvent = js.native
}
object OfflineAudioContextEventMap {
  
  @scala.inline
  def apply(complete: OfflineAudioCompletionEvent, statechange: Event): OfflineAudioContextEventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAudioContextEventMap]
  }
}
