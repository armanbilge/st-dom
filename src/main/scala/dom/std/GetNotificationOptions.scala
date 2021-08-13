package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNotificationOptions extends StObject {
  
  var tag: js.UndefOr[java.lang.String] = js.native
}
object GetNotificationOptions {
  
  @scala.inline
  def apply(tag: java.lang.String = null): GetNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNotificationOptions]
  }
}
