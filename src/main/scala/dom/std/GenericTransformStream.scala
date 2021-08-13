package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericTransformStream extends StObject {
  
  val readable: ReadableStream[js.Any] = js.native
  
  val writable: WritableStream[js.Any] = js.native
}
object GenericTransformStream {
  
  @scala.inline
  def apply(readable: ReadableStream[js.Any], writable: WritableStream[js.Any]): GenericTransformStream = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTransformStream]
  }
}
