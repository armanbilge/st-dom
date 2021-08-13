package dom.std

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keyframe
  extends StObject
     with /* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] {
  
  var composite: js.UndefOr[CompositeOperationOrAuto] = js.native
  
  var easing: js.UndefOr[java.lang.String] = js.native
  
  var offset: js.UndefOr[Double | Null] = js.native
}
object Keyframe {
  
  @scala.inline
  def apply(
    StringDictionary: /* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] = null,
    composite: CompositeOperationOrAuto = null,
    easing: java.lang.String = null,
    offset: js.UndefOr[Null | Double] = js.undefined
  ): Keyframe = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (composite != null) __obj.updateDynamic("composite")(composite.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyframe]
  }
}
