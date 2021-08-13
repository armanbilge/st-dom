package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeObserverOptions extends StObject {
  
  var box: js.UndefOr[ResizeObserverBoxOptions] = js.native
}
object ResizeObserverOptions {
  
  @scala.inline
  def apply(box: ResizeObserverBoxOptions = null): ResizeObserverOptions = {
    val __obj = js.Dynamic.literal()
    if (box != null) __obj.updateDynamic("box")(box.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverOptions]
  }
}
