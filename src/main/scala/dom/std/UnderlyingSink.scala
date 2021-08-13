package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnderlyingSink[W] extends StObject {
  
  var abort: js.UndefOr[UnderlyingSinkAbortCallback] = js.native
  
  var close: js.UndefOr[UnderlyingSinkCloseCallback] = js.native
  
  var start: js.UndefOr[UnderlyingSinkStartCallback] = js.native
  
  var `type`: Unit = js.native
  
  var write: js.UndefOr[UnderlyingSinkWriteCallback[W]] = js.native
}
object UnderlyingSink {
  
  @scala.inline
  def apply[W](
    `type`: Unit,
    abort: /* reason */ js.Any => Unit | js.Thenable[Unit] = null,
    close: () => Unit | js.Thenable[Unit] = null,
    start: /* controller */ WritableStreamDefaultController => Unit | js.Thenable[Unit] = null,
    write: (W, /* controller */ WritableStreamDefaultController) => Unit | js.Thenable[Unit] = null
  ): UnderlyingSink[W] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction1(abort))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction2(write))
    __obj.asInstanceOf[UnderlyingSink[W]]
  }
}
