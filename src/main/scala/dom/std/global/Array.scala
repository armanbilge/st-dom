package dom.std.global

import dom.std.ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Array")
@js.native
class Array[T] protected ()
  extends StObject
     with dom.std.Array[T] {
  def this(arrayLength: Double) = this()
  def this(items: T*) = this()
}
object Array {
  
  @scala.inline
  def apply: ArrayConstructor = js.Dynamic.global.selectDynamic("Array").asInstanceOf[ArrayConstructor]
}
