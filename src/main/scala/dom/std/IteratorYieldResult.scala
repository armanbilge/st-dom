package dom.std

import dom.std.stdBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IteratorYieldResult[TYield]
  extends StObject
     with IteratorResult[TYield, js.Any] {
  
  var done: js.UndefOr[`false`] = js.native
  
  var value: TYield = js.native
}
object IteratorYieldResult {
  
  @scala.inline
  def apply[TYield](value: TYield, done: `false` = null): IteratorYieldResult[TYield] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorYieldResult[TYield]]
  }
}
