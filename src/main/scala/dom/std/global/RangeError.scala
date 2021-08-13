package dom.std.global

import dom.std.RangeErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RangeError")
@js.native
class RangeError ()
  extends StObject
     with dom.std.Error {
  def this(message: java.lang.String) = this()
}
object RangeError {
  
  @scala.inline
  def apply: RangeErrorConstructor = js.Dynamic.global.selectDynamic("RangeError").asInstanceOf[RangeErrorConstructor]
}
