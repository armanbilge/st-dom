package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkletOptions extends StObject {
  
  var credentials: js.UndefOr[RequestCredentials] = js.native
}
object WorkletOptions {
  
  @scala.inline
  def apply(credentials: RequestCredentials = null): WorkletOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkletOptions]
  }
}
