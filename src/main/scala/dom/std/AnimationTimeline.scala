package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationTimeline extends StObject {
  
  val currentTime: Double | Null = js.native
}
object AnimationTimeline {
  
  @scala.inline
  def apply(currentTime: Double = null.asInstanceOf[Double]): AnimationTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentTime")(if (currentTime != null) currentTime.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[AnimationTimeline]
  }
}
