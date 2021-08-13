package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentTimelineOptions extends StObject {
  
  var originTime: js.UndefOr[Double] = js.native
}
object DocumentTimelineOptions {
  
  @scala.inline
  def apply(originTime: js.UndefOr[Double] = js.undefined): DocumentTimelineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(originTime)) __obj.updateDynamic("originTime")(originTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentTimelineOptions]
  }
}
