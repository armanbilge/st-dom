package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageEventInit
  extends StObject
     with EventInit {
  
  var key: js.UndefOr[java.lang.String | Null] = js.native
  
  var newValue: js.UndefOr[java.lang.String | Null] = js.native
  
  var oldValue: js.UndefOr[java.lang.String | Null] = js.native
  
  var storageArea: js.UndefOr[Storage | Null] = js.native
  
  var url: js.UndefOr[java.lang.String] = js.native
}
object StorageEventInit {
  
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    key: js.UndefOr[Null | java.lang.String] = js.undefined,
    newValue: js.UndefOr[Null | java.lang.String] = js.undefined,
    oldValue: js.UndefOr[Null | java.lang.String] = js.undefined,
    storageArea: js.UndefOr[Null | Storage] = js.undefined,
    url: java.lang.String = null
  ): StorageEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(newValue)) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (!js.isUndefined(oldValue)) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    if (!js.isUndefined(storageArea)) __obj.updateDynamic("storageArea")(storageArea.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageEventInit]
  }
}
