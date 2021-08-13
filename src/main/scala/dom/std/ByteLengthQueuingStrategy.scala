package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
@js.native
trait ByteLengthQueuingStrategy
  extends StObject
     with QueuingStrategy[ArrayBufferView] {
  
  @JSName("highWaterMark")
  val highWaterMark_ByteLengthQueuingStrategy: Double = js.native
  
  @JSName("size")
  def size_MByteLengthQueuingStrategy(chunk: ArrayBufferView): Double = js.native
}
object ByteLengthQueuingStrategy {
  
  @scala.inline
  def apply(highWaterMark: Double, size: ArrayBufferView => Double): ByteLengthQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[ByteLengthQueuingStrategy]
  }
}
