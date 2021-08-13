package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpHeaderExtension extends StObject {
  
  var kind: js.UndefOr[java.lang.String] = js.native
  
  var preferredEncrypt: js.UndefOr[scala.Boolean] = js.native
  
  var preferredId: js.UndefOr[Double] = js.native
  
  var uri: js.UndefOr[java.lang.String] = js.native
}
object RTCRtpHeaderExtension {
  
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    preferredEncrypt: js.UndefOr[scala.Boolean] = js.undefined,
    preferredId: js.UndefOr[Double] = js.undefined,
    uri: java.lang.String = null
  ): RTCRtpHeaderExtension = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(preferredEncrypt)) __obj.updateDynamic("preferredEncrypt")(preferredEncrypt.asInstanceOf[js.Any])
    if (!js.isUndefined(preferredId)) __obj.updateDynamic("preferredId")(preferredId.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpHeaderExtension]
  }
}
