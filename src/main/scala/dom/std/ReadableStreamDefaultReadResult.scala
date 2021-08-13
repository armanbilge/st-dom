package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - dom.std.ReadableStreamDefaultReadValueResult[T]
  - dom.std.ReadableStreamDefaultReadDoneResult
*/
trait ReadableStreamDefaultReadResult[T] extends StObject
object ReadableStreamDefaultReadResult {
  
  @scala.inline
  def ReadableStreamDefaultReadDoneResult(value: Unit): dom.std.ReadableStreamDefaultReadDoneResult = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[dom.std.ReadableStreamDefaultReadDoneResult]
  }
  
  @scala.inline
  def ReadableStreamDefaultReadValueResult[T](value: T): dom.std.ReadableStreamDefaultReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[dom.std.ReadableStreamDefaultReadValueResult[T]]
  }
}
