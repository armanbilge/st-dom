package dom.std.global

import dom.std.BodyInit
import dom.std.ResponseInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Response")
@js.native
class Response ()
  extends StObject
     with dom.std.Response {
  def this(body: BodyInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  def this(body: Unit, init: ResponseInit) = this()
}
object Response {
  
  @JSGlobal("Response")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def error(): dom.std.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[dom.std.Response]
  
  @scala.inline
  def redirect(url: java.lang.String): dom.std.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[dom.std.Response]
  @scala.inline
  def redirect(url: java.lang.String, status: Double): dom.std.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[dom.std.Response]
}
