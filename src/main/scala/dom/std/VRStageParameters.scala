package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRStageParameters extends StObject {
  
  var sittingToStandingTransform: js.UndefOr[Float32Array] = js.native
  
  var sizeX: js.UndefOr[Double] = js.native
  
  var sizeY: js.UndefOr[Double] = js.native
}
object VRStageParameters {
  
  @scala.inline
  def apply(
    sittingToStandingTransform: Float32Array = null,
    sizeX: js.UndefOr[Double] = js.undefined,
    sizeY: js.UndefOr[Double] = js.undefined
  ): VRStageParameters = {
    val __obj = js.Dynamic.literal()
    if (sittingToStandingTransform != null) __obj.updateDynamic("sittingToStandingTransform")(sittingToStandingTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeX)) __obj.updateDynamic("sizeX")(sizeX.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeY)) __obj.updateDynamic("sizeY")(sizeY.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRStageParameters]
  }
}
