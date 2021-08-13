package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to represent a set of time ranges, primarily for the purpose of tracking which portions of media have been buffered when loading it for use by the <audio> and <video> elements. */
@js.native
trait TimeRanges extends StObject {
  
  /**
    * Returns the time for the end of the range with the given index.
    *
    * Throws an "IndexSizeError" DOMException if the index is out of range.
    */
  def end(index: Double): Double = js.native
  
  /**
    * Returns the number of ranges in the object.
    */
  val length: Double = js.native
  
  /**
    * Returns the time for the start of the range with the given index.
    *
    * Throws an "IndexSizeError" DOMException if the index is out of range.
    */
  def start(index: Double): Double = js.native
}
object TimeRanges {
  
  @scala.inline
  def apply(end: Double => Double, length: Double, start: Double => Double): TimeRanges = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), length = length.asInstanceOf[js.Any], start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[TimeRanges]
  }
}
