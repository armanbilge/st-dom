package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaQueryListEventInit
  extends StObject
     with EventInit {
  
  var matches: js.UndefOr[scala.Boolean] = js.native
  
  var media: js.UndefOr[java.lang.String] = js.native
}
object MediaQueryListEventInit {
  
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    matches: js.UndefOr[scala.Boolean] = js.undefined,
    media: java.lang.String = null
  ): MediaQueryListEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (!js.isUndefined(matches)) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryListEventInit]
  }
}
