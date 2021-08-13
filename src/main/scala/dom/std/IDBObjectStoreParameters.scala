package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBObjectStoreParameters extends StObject {
  
  var autoIncrement: js.UndefOr[scala.Boolean] = js.native
  
  var keyPath: js.UndefOr[java.lang.String | js.Array[java.lang.String] | Null] = js.native
}
object IDBObjectStoreParameters {
  
  @scala.inline
  def apply(
    autoIncrement: js.UndefOr[scala.Boolean] = js.undefined,
    keyPath: js.UndefOr[Null | java.lang.String | js.Array[java.lang.String]] = js.undefined
  ): IDBObjectStoreParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIncrement)) __obj.updateDynamic("autoIncrement")(autoIncrement.asInstanceOf[js.Any])
    if (!js.isUndefined(keyPath)) __obj.updateDynamic("keyPath")(keyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBObjectStoreParameters]
  }
}
