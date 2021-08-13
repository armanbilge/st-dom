package dom.std.global

import dom.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Boolean")
@js.native
class Boolean ()
  extends StObject
     with dom.std.Boolean {
  def this(value: js.Any) = this()
}
object Boolean {
  
  @scala.inline
  def apply: BooleanConstructor = js.Dynamic.global.selectDynamic("Boolean").asInstanceOf[BooleanConstructor]
}
