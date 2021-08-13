package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementDefinitionOptions extends StObject {
  
  var `extends`: js.UndefOr[java.lang.String] = js.native
}
object ElementDefinitionOptions {
  
  @scala.inline
  def apply(`extends`: java.lang.String = null): ElementDefinitionOptions = {
    val __obj = js.Dynamic.literal()
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionOptions]
  }
}
