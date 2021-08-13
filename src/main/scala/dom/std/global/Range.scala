package dom.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Range")
@js.native
class Range ()
  extends StObject
     with dom.std.Range
object Range {
  
  @JSGlobal("Range")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Range.END_TO_END")
  @js.native
  val END_TO_END: Double = js.native
  
  @JSGlobal("Range.END_TO_START")
  @js.native
  val END_TO_START: Double = js.native
  
  @JSGlobal("Range.START_TO_END")
  @js.native
  val START_TO_END: Double = js.native
  
  @JSGlobal("Range.START_TO_START")
  @js.native
  val START_TO_START: Double = js.native
  
  @scala.inline
  def toString_(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[java.lang.String]
}
