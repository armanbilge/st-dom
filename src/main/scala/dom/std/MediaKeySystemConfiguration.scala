package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaKeySystemConfiguration extends StObject {
  
  var audioCapabilities: js.UndefOr[js.Array[MediaKeySystemMediaCapability]] = js.native
  
  var distinctiveIdentifier: js.UndefOr[MediaKeysRequirement] = js.native
  
  var initDataTypes: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var label: js.UndefOr[java.lang.String] = js.native
  
  var persistentState: js.UndefOr[MediaKeysRequirement] = js.native
  
  var sessionTypes: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var videoCapabilities: js.UndefOr[js.Array[MediaKeySystemMediaCapability]] = js.native
}
object MediaKeySystemConfiguration {
  
  @scala.inline
  def apply(
    audioCapabilities: js.Array[MediaKeySystemMediaCapability] = null,
    distinctiveIdentifier: MediaKeysRequirement = null,
    initDataTypes: js.Array[java.lang.String] = null,
    label: java.lang.String = null,
    persistentState: MediaKeysRequirement = null,
    sessionTypes: js.Array[java.lang.String] = null,
    videoCapabilities: js.Array[MediaKeySystemMediaCapability] = null
  ): MediaKeySystemConfiguration = {
    val __obj = js.Dynamic.literal()
    if (audioCapabilities != null) __obj.updateDynamic("audioCapabilities")(audioCapabilities.asInstanceOf[js.Any])
    if (distinctiveIdentifier != null) __obj.updateDynamic("distinctiveIdentifier")(distinctiveIdentifier.asInstanceOf[js.Any])
    if (initDataTypes != null) __obj.updateDynamic("initDataTypes")(initDataTypes.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (persistentState != null) __obj.updateDynamic("persistentState")(persistentState.asInstanceOf[js.Any])
    if (sessionTypes != null) __obj.updateDynamic("sessionTypes")(sessionTypes.asInstanceOf[js.Any])
    if (videoCapabilities != null) __obj.updateDynamic("videoCapabilities")(videoCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeySystemConfiguration]
  }
}
