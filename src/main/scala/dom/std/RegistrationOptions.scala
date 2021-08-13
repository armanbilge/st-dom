package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistrationOptions extends StObject {
  
  var scope: js.UndefOr[java.lang.String] = js.native
  
  var `type`: js.UndefOr[WorkerType] = js.native
  
  var updateViaCache: js.UndefOr[ServiceWorkerUpdateViaCache] = js.native
}
object RegistrationOptions {
  
  @scala.inline
  def apply(
    scope: java.lang.String = null,
    `type`: WorkerType = null,
    updateViaCache: ServiceWorkerUpdateViaCache = null
  ): RegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updateViaCache != null) __obj.updateDynamic("updateViaCache")(updateViaCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationOptions]
  }
}
