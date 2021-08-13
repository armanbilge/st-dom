package dom.std

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputedKeyframe
  extends StObject
     with /* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] {
  
  var composite: CompositeOperationOrAuto = js.native
  
  var computedOffset: Double = js.native
  
  var easing: java.lang.String = js.native
  
  var offset: Double | Null = js.native
}
object ComputedKeyframe {
  
  @scala.inline
  def apply(
    composite: CompositeOperationOrAuto,
    computedOffset: Double,
    easing: java.lang.String,
    StringDictionary: /* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] = null,
    offset: Double = null.asInstanceOf[Double]
  ): ComputedKeyframe = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], computedOffset = computedOffset.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.updateDynamic("offset")(if (offset != null) offset.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[ComputedKeyframe]
  }
}
