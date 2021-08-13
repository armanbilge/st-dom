package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstrainVideoFacingModeParameters extends StObject {
  
  var exact: js.UndefOr[VideoFacingModeEnum | js.Array[VideoFacingModeEnum]] = js.native
  
  var ideal: js.UndefOr[VideoFacingModeEnum | js.Array[VideoFacingModeEnum]] = js.native
}
object ConstrainVideoFacingModeParameters {
  
  @scala.inline
  def apply(
    exact: VideoFacingModeEnum | js.Array[VideoFacingModeEnum] = null,
    ideal: VideoFacingModeEnum | js.Array[VideoFacingModeEnum] = null
  ): ConstrainVideoFacingModeParameters = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainVideoFacingModeParameters]
  }
}
