package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceServer extends StObject {
  
  var credential: js.UndefOr[java.lang.String] = js.native
  
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.native
  
  var urls: java.lang.String | js.Array[java.lang.String] = js.native
  
  var username: js.UndefOr[java.lang.String] = js.native
}
object RTCIceServer {
  
  @scala.inline
  def apply(
    urls: java.lang.String | js.Array[java.lang.String],
    credential: java.lang.String = null,
    credentialType: RTCIceCredentialType = null,
    username: java.lang.String = null
  ): RTCIceServer = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    if (credential != null) __obj.updateDynamic("credential")(credential.asInstanceOf[js.Any])
    if (credentialType != null) __obj.updateDynamic("credentialType")(credentialType.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceServer]
  }
}
