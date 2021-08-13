package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
@js.native
trait CountQueuingStrategy
  extends StObject
     with QueuingStrategy[js.Any] {
  
  @JSName("highWaterMark")
  val highWaterMark_CountQueuingStrategy: Double = js.native
  
  @JSName("size")
  def size_MCountQueuingStrategy(chunk: js.Any): Double = js.native
}
object CountQueuingStrategy {
  
  @scala.inline
  def apply(highWaterMark: Double, size: js.Any => Double): CountQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[CountQueuingStrategy]
  }
}
