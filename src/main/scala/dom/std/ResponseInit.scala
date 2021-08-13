package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseInit extends StObject {
  
  var headers: js.UndefOr[HeadersInit] = js.native
  
  var status: js.UndefOr[Double] = js.native
  
  var statusText: js.UndefOr[java.lang.String] = js.native
}
object ResponseInit {
  
  @scala.inline
  def apply(
    headers: HeadersInit = null,
    status: js.UndefOr[Double] = js.undefined,
    statusText: java.lang.String = null
  ): ResponseInit = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInit]
  }
}
