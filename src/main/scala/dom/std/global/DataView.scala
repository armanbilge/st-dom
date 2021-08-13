package dom.std.global

import dom.std.ArrayBufferLike
import dom.std.DataViewConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DataView")
@js.native
class DataView protected ()
  extends StObject
     with dom.std.DataView {
  def this(buffer: ArrayBufferLike) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, byteLength: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Unit, byteLength: Double) = this()
}
object DataView {
  
  @scala.inline
  def apply: DataViewConstructor = js.Dynamic.global.selectDynamic("DataView").asInstanceOf[DataViewConstructor]
}
