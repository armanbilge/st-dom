package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioContextInfo extends StObject {
  
  var currentTime: js.UndefOr[Double] = js.native
  
  var sampleRate: js.UndefOr[Double] = js.native
}
object AudioContextInfo {
  
  @scala.inline
  def apply(currentTime: js.UndefOr[Double] = js.undefined, sampleRate: js.UndefOr[Double] = js.undefined): AudioContextInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentTime)) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioContextInfo]
  }
}
