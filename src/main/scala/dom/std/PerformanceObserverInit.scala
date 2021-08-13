package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceObserverInit extends StObject {
  
  var buffered: js.UndefOr[scala.Boolean] = js.native
  
  var entryTypes: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var `type`: js.UndefOr[java.lang.String] = js.native
}
object PerformanceObserverInit {
  
  @scala.inline
  def apply(
    buffered: js.UndefOr[scala.Boolean] = js.undefined,
    entryTypes: js.Array[java.lang.String] = null,
    `type`: java.lang.String = null
  ): PerformanceObserverInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered.asInstanceOf[js.Any])
    if (entryTypes != null) __obj.updateDynamic("entryTypes")(entryTypes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceObserverInit]
  }
}
