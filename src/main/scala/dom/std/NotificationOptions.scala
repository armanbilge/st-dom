package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationOptions extends StObject {
  
  var actions: js.UndefOr[js.Array[NotificationAction]] = js.native
  
  var badge: js.UndefOr[java.lang.String] = js.native
  
  var body: js.UndefOr[java.lang.String] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var dir: js.UndefOr[NotificationDirection] = js.native
  
  var icon: js.UndefOr[java.lang.String] = js.native
  
  var image: js.UndefOr[java.lang.String] = js.native
  
  var lang: js.UndefOr[java.lang.String] = js.native
  
  var renotify: js.UndefOr[scala.Boolean] = js.native
  
  var requireInteraction: js.UndefOr[scala.Boolean] = js.native
  
  var silent: js.UndefOr[scala.Boolean] = js.native
  
  var tag: js.UndefOr[java.lang.String] = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
  
  var vibrate: js.UndefOr[VibratePattern] = js.native
}
object NotificationOptions {
  
  @scala.inline
  def apply(
    actions: js.Array[NotificationAction] = null,
    badge: java.lang.String = null,
    body: java.lang.String = null,
    data: js.Any = null,
    dir: NotificationDirection = null,
    icon: java.lang.String = null,
    image: java.lang.String = null,
    lang: java.lang.String = null,
    renotify: js.UndefOr[scala.Boolean] = js.undefined,
    requireInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    tag: java.lang.String = null,
    timestamp: js.UndefOr[Double] = js.undefined,
    vibrate: VibratePattern = null
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(renotify)) __obj.updateDynamic("renotify")(renotify.asInstanceOf[js.Any])
    if (!js.isUndefined(requireInteraction)) __obj.updateDynamic("requireInteraction")(requireInteraction.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (vibrate != null) __obj.updateDynamic("vibrate")(vibrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
}
