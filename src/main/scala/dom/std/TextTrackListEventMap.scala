package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackListEventMap extends StObject {
  
  var addtrack: TrackEvent = js.native
  
  var change: Event = js.native
  
  var removetrack: TrackEvent = js.native
}
object TextTrackListEventMap {
  
  @scala.inline
  def apply(addtrack: TrackEvent, change: Event, removetrack: TrackEvent): TextTrackListEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], removetrack = removetrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackListEventMap]
  }
}
