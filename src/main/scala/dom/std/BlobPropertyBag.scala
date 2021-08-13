package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobPropertyBag extends StObject {
  
  var endings: js.UndefOr[EndingType] = js.native
  
  var `type`: js.UndefOr[java.lang.String] = js.native
}
object BlobPropertyBag {
  
  @scala.inline
  def apply(endings: EndingType = null, `type`: java.lang.String = null): BlobPropertyBag = {
    val __obj = js.Dynamic.literal()
    if (endings != null) __obj.updateDynamic("endings")(endings.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobPropertyBag]
  }
}
