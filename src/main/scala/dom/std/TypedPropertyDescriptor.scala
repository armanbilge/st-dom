package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedPropertyDescriptor[T] extends StObject {
  
  var configurable: js.UndefOr[scala.Boolean] = js.native
  
  var enumerable: js.UndefOr[scala.Boolean] = js.native
  
  var get: js.UndefOr[js.Function0[T]] = js.native
  
  var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  
  var value: js.UndefOr[T] = js.native
  
  var writable: js.UndefOr[scala.Boolean] = js.native
}
object TypedPropertyDescriptor {
  
  @scala.inline
  def apply[T](
    configurable: js.UndefOr[scala.Boolean] = js.undefined,
    enumerable: js.UndefOr[scala.Boolean] = js.undefined,
    get: () => T = null,
    set: /* value */ T => Unit = null,
    value: T = null,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): TypedPropertyDescriptor[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable.asInstanceOf[js.Any])
    if (!js.isUndefined(enumerable)) __obj.updateDynamic("enumerable")(enumerable.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction0(get))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1(set))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedPropertyDescriptor[T]]
  }
}
