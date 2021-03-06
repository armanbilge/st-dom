package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerOptions extends StObject {
  
  var credentials: js.UndefOr[RequestCredentials] = js.native
  
  var name: js.UndefOr[java.lang.String] = js.native
  
  var `type`: js.UndefOr[WorkerType] = js.native
}
object WorkerOptions {
  
  @scala.inline
  def apply(credentials: RequestCredentials = null, name: java.lang.String = null, `type`: WorkerType = null): WorkerOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOptions]
  }
}
