package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMQuadInit extends StObject {
  
  var p1: js.UndefOr[DOMPointInit] = js.native
  
  var p2: js.UndefOr[DOMPointInit] = js.native
  
  var p3: js.UndefOr[DOMPointInit] = js.native
  
  var p4: js.UndefOr[DOMPointInit] = js.native
}
object DOMQuadInit {
  
  @scala.inline
  def apply(p1: DOMPointInit = null, p2: DOMPointInit = null, p3: DOMPointInit = null, p4: DOMPointInit = null): DOMQuadInit = {
    val __obj = js.Dynamic.literal()
    if (p1 != null) __obj.updateDynamic("p1")(p1.asInstanceOf[js.Any])
    if (p2 != null) __obj.updateDynamic("p2")(p2.asInstanceOf[js.Any])
    if (p3 != null) __obj.updateDynamic("p3")(p3.asInstanceOf[js.Any])
    if (p4 != null) __obj.updateDynamic("p4")(p4.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMQuadInit]
  }
}
