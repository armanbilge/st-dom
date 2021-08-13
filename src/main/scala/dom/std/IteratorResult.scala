package dom.std

import dom.std.stdBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - dom.std.IteratorYieldResult[T]
  - dom.std.IteratorReturnResult[TReturn]
*/
trait IteratorResult[T, TReturn] extends StObject
object IteratorResult {
  
  @scala.inline
  def IteratorReturnResult[TReturn](value: TReturn): dom.std.IteratorReturnResult[TReturn] = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[dom.std.IteratorReturnResult[TReturn]]
  }
  
  @scala.inline
  def IteratorYieldResult[T](value: T, done: `false` = null): dom.std.IteratorYieldResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    __obj.asInstanceOf[dom.std.IteratorYieldResult[T]]
  }
}
