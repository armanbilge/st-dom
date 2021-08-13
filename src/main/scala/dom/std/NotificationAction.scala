package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationAction extends StObject {
  
  var action: java.lang.String = js.native
  
  var icon: js.UndefOr[java.lang.String] = js.native
  
  var title: java.lang.String = js.native
}
object NotificationAction {
  
  @scala.inline
  def apply(action: java.lang.String, title: java.lang.String, icon: java.lang.String = null): NotificationAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationAction]
  }
}
