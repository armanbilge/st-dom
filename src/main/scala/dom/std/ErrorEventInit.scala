package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorEventInit
  extends StObject
     with EventInit {
  
  var colno: js.UndefOr[Double] = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  var filename: js.UndefOr[java.lang.String] = js.native
  
  var lineno: js.UndefOr[Double] = js.native
  
  var message: js.UndefOr[java.lang.String] = js.native
}
object ErrorEventInit {
  
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    colno: js.UndefOr[Double] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.Any = null,
    filename: java.lang.String = null,
    lineno: js.UndefOr[Double] = js.undefined,
    message: java.lang.String = null
  ): ErrorEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(colno)) __obj.updateDynamic("colno")(colno.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(lineno)) __obj.updateDynamic("lineno")(lineno.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEventInit]
  }
}
