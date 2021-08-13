package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstantSourceOptions extends StObject {
  
  var offset: js.UndefOr[Double] = js.native
}
object ConstantSourceOptions {
  
  @scala.inline
  def apply(offset: js.UndefOr[Double] = js.undefined): ConstantSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstantSourceOptions]
  }
}
