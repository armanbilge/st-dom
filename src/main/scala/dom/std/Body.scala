package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends StObject {
  
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  
  def blob(): js.Promise[Blob] = js.native
  
  val body: ReadableStream[Uint8Array] | Null = js.native
  
  val bodyUsed: scala.Boolean = js.native
  
  def formData(): js.Promise[FormData] = js.native
  
  def json(): js.Promise[js.Any] = js.native
  
  def text(): js.Promise[java.lang.String] = js.native
}
object Body {
  
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: scala.Boolean,
    formData: () => js.Promise[FormData],
    json: () => js.Promise[js.Any],
    text: () => js.Promise[java.lang.String],
    body: ReadableStream[Uint8Array] = null
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    __obj.updateDynamic("body")(if (body != null) body.asInstanceOf[ReadableStream[Uint8Array]].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[Body]
  }
}
