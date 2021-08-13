package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementCreationOptions extends StObject {
  
  var is: js.UndefOr[java.lang.String] = js.native
}
object ElementCreationOptions {
  
  @scala.inline
  def apply(is: java.lang.String = null): ElementCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCreationOptions]
  }
}
