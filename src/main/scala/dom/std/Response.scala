package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Fetch API interface represents the response to a request. */
@js.native
trait Response
  extends StObject
     with Body {
  
  val headers: Headers = js.native
  
  val ok: scala.Boolean = js.native
  
  val redirected: scala.Boolean = js.native
  
  val status: Double = js.native
  
  val statusText: java.lang.String = js.native
  
  val trailer: js.Promise[Headers] = js.native
  
  val `type`: ResponseType = js.native
  
  val url: java.lang.String = js.native
}
object Response {
  
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: scala.Boolean,
    formData: () => js.Promise[FormData],
    headers: Headers,
    json: () => js.Promise[js.Any],
    ok: scala.Boolean,
    redirected: scala.Boolean,
    status: Double,
    statusText: java.lang.String,
    text: () => js.Promise[java.lang.String],
    trailer: js.Promise[Headers],
    `type`: ResponseType,
    url: java.lang.String,
    body: ReadableStream[Uint8Array] = null
  ): Response = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("body")(if (body != null) body.asInstanceOf[ReadableStream[Uint8Array]].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[Response]
  }
}
