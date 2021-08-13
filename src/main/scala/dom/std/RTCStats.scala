package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCStats extends StObject {
  
  var id: js.UndefOr[java.lang.String] = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[RTCStatsType] = js.native
}
object RTCStats {
  
  @scala.inline
  def apply(
    id: java.lang.String = null,
    timestamp: js.UndefOr[Double] = js.undefined,
    `type`: RTCStatsType = null
  ): RTCStats = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCStats]
  }
}
