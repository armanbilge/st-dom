package dom.std.global

import dom.std.EvalErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("EvalError")
@js.native
class EvalError ()
  extends StObject
     with dom.std.Error {
  def this(message: java.lang.String) = this()
}
object EvalError {
  
  @scala.inline
  def apply: EvalErrorConstructor = js.Dynamic.global.selectDynamic("EvalError").asInstanceOf[EvalErrorConstructor]
}
