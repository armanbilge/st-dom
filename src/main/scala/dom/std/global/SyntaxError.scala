package dom.std.global

import dom.std.SyntaxErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SyntaxError")
@js.native
class SyntaxError ()
  extends StObject
     with dom.std.Error {
  def this(message: java.lang.String) = this()
}
object SyntaxError {
  
  @scala.inline
  def apply: SyntaxErrorConstructor = js.Dynamic.global.selectDynamic("SyntaxError").asInstanceOf[SyntaxErrorConstructor]
}
