package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The legacy PerformanceNavigation interface represents information about how the navigation to the current document was done.
  * @deprecated This interface is deprecated in the Navigation Timing Level 2 specification. Please use the PerformanceNavigationTiming interface instead.
  */
@js.native
trait PerformanceNavigation extends StObject {
  
  val TYPE_BACK_FORWARD: Double = js.native
  
  val TYPE_NAVIGATE: Double = js.native
  
  val TYPE_RELOAD: Double = js.native
  
  val TYPE_RESERVED: Double = js.native
  
  val redirectCount: Double = js.native
  
  def toJSON(): js.Any = js.native
  
  val `type`: Double = js.native
}
object PerformanceNavigation {
  
  @scala.inline
  def apply(
    TYPE_BACK_FORWARD: Double,
    TYPE_NAVIGATE: Double,
    TYPE_RELOAD: Double,
    TYPE_RESERVED: Double,
    redirectCount: Double,
    toJSON: () => js.Any,
    `type`: Double
  ): PerformanceNavigation = {
    val __obj = js.Dynamic.literal(TYPE_BACK_FORWARD = TYPE_BACK_FORWARD.asInstanceOf[js.Any], TYPE_NAVIGATE = TYPE_NAVIGATE.asInstanceOf[js.Any], TYPE_RELOAD = TYPE_RELOAD.asInstanceOf[js.Any], TYPE_RESERVED = TYPE_RESERVED.asInstanceOf[js.Any], redirectCount = redirectCount.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceNavigation]
  }
}
