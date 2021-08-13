package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyDescriptor extends StObject {
  
  var configurable: js.UndefOr[scala.Boolean] = js.native
  
  var enumerable: js.UndefOr[scala.Boolean] = js.native
  
  var get: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var set: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
  
  var writable: js.UndefOr[scala.Boolean] = js.native
}
object PropertyDescriptor {
  
  @scala.inline
  def apply(
    configurable: js.UndefOr[scala.Boolean] = js.undefined,
    enumerable: js.UndefOr[scala.Boolean] = js.undefined,
    get: () => js.Any = null,
    set: /* v */ js.Any => Unit = null,
    value: js.Any = null,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): PropertyDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable.asInstanceOf[js.Any])
    if (!js.isUndefined(enumerable)) __obj.updateDynamic("enumerable")(enumerable.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction0(get))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1(set))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyDescriptor]
  }
}
