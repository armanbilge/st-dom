package dom.std

import dom.std.stdBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamDefaultReadValueResult[T]
  extends StObject
     with ReadableStreamDefaultReadResult[T] {
  
  var done: `false` = js.native
  
  var value: T = js.native
}
object ReadableStreamDefaultReadValueResult {
  
  @scala.inline
  def apply[T](value: T): ReadableStreamDefaultReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamDefaultReadValueResult[T]]
  }
}
