package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLHttpRequestEventTargetEventMap extends StObject {
  
  var abort: ProgressEvent[XMLHttpRequestEventTarget] = js.native
  
  var error: ProgressEvent[XMLHttpRequestEventTarget] = js.native
  
  var load: ProgressEvent[XMLHttpRequestEventTarget] = js.native
  
  var loadend: ProgressEvent[XMLHttpRequestEventTarget] = js.native
  
  var loadstart: ProgressEvent[XMLHttpRequestEventTarget] = js.native
  
  var progress: ProgressEvent[XMLHttpRequestEventTarget] = js.native
  
  var timeout: ProgressEvent[XMLHttpRequestEventTarget] = js.native
}
object XMLHttpRequestEventTargetEventMap {
  
  @scala.inline
  def apply(
    abort: ProgressEvent[XMLHttpRequestEventTarget],
    error: ProgressEvent[XMLHttpRequestEventTarget],
    load: ProgressEvent[XMLHttpRequestEventTarget],
    loadend: ProgressEvent[XMLHttpRequestEventTarget],
    loadstart: ProgressEvent[XMLHttpRequestEventTarget],
    progress: ProgressEvent[XMLHttpRequestEventTarget],
    timeout: ProgressEvent[XMLHttpRequestEventTarget]
  ): XMLHttpRequestEventTargetEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventTargetEventMap]
  }
}
