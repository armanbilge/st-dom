package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeriodicWaveOptions
  extends StObject
     with PeriodicWaveConstraints {
  
  var imag: js.UndefOr[js.Array[Double] | Float32Array] = js.native
  
  var real: js.UndefOr[js.Array[Double] | Float32Array] = js.native
}
object PeriodicWaveOptions {
  
  @scala.inline
  def apply(
    disableNormalization: js.UndefOr[scala.Boolean] = js.undefined,
    imag: js.Array[Double] | Float32Array = null,
    real: js.Array[Double] | Float32Array = null
  ): PeriodicWaveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableNormalization)) __obj.updateDynamic("disableNormalization")(disableNormalization.asInstanceOf[js.Any])
    if (imag != null) __obj.updateDynamic("imag")(imag.asInstanceOf[js.Any])
    if (real != null) __obj.updateDynamic("real")(real.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeriodicWaveOptions]
  }
}
