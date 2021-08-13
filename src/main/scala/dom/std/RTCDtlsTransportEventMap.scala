package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDtlsTransportEventMap extends StObject {
  
  var error: RTCErrorEvent = js.native
  
  var statechange: Event = js.native
}
object RTCDtlsTransportEventMap {
  
  @scala.inline
  def apply(error: RTCErrorEvent, statechange: Event): RTCDtlsTransportEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtlsTransportEventMap]
  }
}
