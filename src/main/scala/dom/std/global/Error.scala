package dom.std.global

import dom.std.ErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Error")
@js.native
class Error ()
  extends StObject
     with dom.std.Error {
  def this(message: java.lang.String) = this()
}
object Error {
  
  @scala.inline
  def apply: ErrorConstructor = js.Dynamic.global.selectDynamic("Error").asInstanceOf[ErrorConstructor]
}
