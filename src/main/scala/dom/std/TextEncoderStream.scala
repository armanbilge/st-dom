package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEncoderStream
  extends StObject
     with GenericTransformStream
     with TextEncoderCommon {
  
  @JSName("readable")
  val readable_TextEncoderStream: ReadableStream[Uint8Array] = js.native
  
  @JSName("writable")
  val writable_TextEncoderStream: WritableStream[java.lang.String] = js.native
}
object TextEncoderStream {
  
  @scala.inline
  def apply(
    encoding: java.lang.String,
    readable: ReadableStream[Uint8Array],
    writable: WritableStream[java.lang.String]
  ): TextEncoderStream = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoderStream]
  }
}
