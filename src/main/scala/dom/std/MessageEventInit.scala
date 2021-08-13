package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageEventInit[T]
  extends StObject
     with EventInit {
  
  var data: js.UndefOr[T] = js.native
  
  var lastEventId: js.UndefOr[java.lang.String] = js.native
  
  var origin: js.UndefOr[java.lang.String] = js.native
  
  var ports: js.UndefOr[js.Array[MessagePort]] = js.native
  
  var source: js.UndefOr[MessageEventSource | Null] = js.native
}
object MessageEventInit {
  
  @scala.inline
  def apply[T](
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    data: T = null,
    lastEventId: java.lang.String = null,
    origin: java.lang.String = null,
    ports: js.Array[MessagePort] = null,
    source: js.UndefOr[Null | MessageEventSource] = js.undefined
  ): MessageEventInit[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (lastEventId != null) __obj.updateDynamic("lastEventId")(lastEventId.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEventInit[T]]
  }
}
