package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnderlyingSource[R] extends StObject {
  
  var cancel: js.UndefOr[UnderlyingSourceCancelCallback] = js.native
  
  var pull: js.UndefOr[UnderlyingSourcePullCallback[R]] = js.native
  
  var start: js.UndefOr[UnderlyingSourceStartCallback[R]] = js.native
  
  var `type`: Unit = js.native
}
object UnderlyingSource {
  
  @scala.inline
  def apply[R](
    `type`: Unit,
    cancel: /* reason */ js.Any => Unit | js.Thenable[Unit] = null,
    pull: /* controller */ ReadableStreamController[R] => Unit | js.Thenable[Unit] = null,
    start: /* controller */ ReadableStreamController[R] => Unit | js.Thenable[Unit] = null
  ): UnderlyingSource[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (pull != null) __obj.updateDynamic("pull")(js.Any.fromFunction1(pull))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    __obj.asInstanceOf[UnderlyingSource[R]]
  }
}
