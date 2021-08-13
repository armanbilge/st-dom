package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileReaderEventMap extends StObject {
  
  var abort: ProgressEvent[FileReader] = js.native
  
  var error: ProgressEvent[FileReader] = js.native
  
  var load: ProgressEvent[FileReader] = js.native
  
  var loadend: ProgressEvent[FileReader] = js.native
  
  var loadstart: ProgressEvent[FileReader] = js.native
  
  var progress: ProgressEvent[FileReader] = js.native
}
object FileReaderEventMap {
  
  @scala.inline
  def apply(
    abort: ProgressEvent[FileReader],
    error: ProgressEvent[FileReader],
    load: ProgressEvent[FileReader],
    loadend: ProgressEvent[FileReader],
    loadstart: ProgressEvent[FileReader],
    progress: ProgressEvent[FileReader]
  ): FileReaderEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileReaderEventMap]
  }
}
