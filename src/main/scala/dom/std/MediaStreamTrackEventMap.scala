package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamTrackEventMap extends StObject {
  
  var ended: Event = js.native
  
  var mute: Event = js.native
  
  var unmute: Event = js.native
}
object MediaStreamTrackEventMap {
  
  @scala.inline
  def apply(ended: Event, mute: Event, unmute: Event): MediaStreamTrackEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], unmute = unmute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackEventMap]
  }
}
