package dom.std.global

import dom.std.ArrayBufferLike
import dom.std.ArrayLike
import dom.std.Int32ArrayConstructor
import dom.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Int32Array")
@js.native
class Int32Array protected ()
  extends StObject
     with dom.std.Int32Array {
  def this(array: ArrayBufferLike) = this()
  def this(array: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
}
object Int32Array {
  
  @scala.inline
  def apply: Int32ArrayConstructor = js.Dynamic.global.selectDynamic("Int32Array").asInstanceOf[Int32ArrayConstructor]
}
