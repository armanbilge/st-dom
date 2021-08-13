package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstrainBooleanParameters extends StObject {
  
  var exact: js.UndefOr[scala.Boolean] = js.native
  
  var ideal: js.UndefOr[scala.Boolean] = js.native
}
object ConstrainBooleanParameters {
  
  @scala.inline
  def apply(exact: js.UndefOr[scala.Boolean] = js.undefined, ideal: js.UndefOr[scala.Boolean] = js.undefined): ConstrainBooleanParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (!js.isUndefined(ideal)) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainBooleanParameters]
  }
}
