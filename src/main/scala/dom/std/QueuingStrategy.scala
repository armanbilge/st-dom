package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueuingStrategy[T] extends StObject {
  
  var highWaterMark: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[QueuingStrategySize[T]] = js.native
}
object QueuingStrategy {
  
  @scala.inline
  def apply[T](highWaterMark: js.UndefOr[Double] = js.undefined, size: T => Double = null): QueuingStrategy[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(js.Any.fromFunction1(size))
    __obj.asInstanceOf[QueuingStrategy[T]]
  }
}
