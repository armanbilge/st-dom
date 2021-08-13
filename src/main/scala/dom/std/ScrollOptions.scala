package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollOptions extends StObject {
  
  var behavior: js.UndefOr[ScrollBehavior] = js.native
}
object ScrollOptions {
  
  @scala.inline
  def apply(behavior: ScrollBehavior = null): ScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOptions]
  }
}
