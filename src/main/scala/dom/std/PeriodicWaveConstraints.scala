package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeriodicWaveConstraints extends StObject {
  
  var disableNormalization: js.UndefOr[scala.Boolean] = js.native
}
object PeriodicWaveConstraints {
  
  @scala.inline
  def apply(disableNormalization: js.UndefOr[scala.Boolean] = js.undefined): PeriodicWaveConstraints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableNormalization)) __obj.updateDynamic("disableNormalization")(disableNormalization.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeriodicWaveConstraints]
  }
}
