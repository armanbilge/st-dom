package dom.std.global

import dom.std.URIErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("URIError")
@js.native
class URIError ()
  extends StObject
     with dom.std.Error {
  def this(message: java.lang.String) = this()
}
object URIError {
  
  @scala.inline
  def apply: URIErrorConstructor = js.Dynamic.global.selectDynamic("URIError").asInstanceOf[URIErrorConstructor]
}
