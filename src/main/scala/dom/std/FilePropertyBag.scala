package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePropertyBag
  extends StObject
     with BlobPropertyBag {
  
  var lastModified: js.UndefOr[Double] = js.native
}
object FilePropertyBag {
  
  @scala.inline
  def apply(
    endings: EndingType = null,
    lastModified: js.UndefOr[Double] = js.undefined,
    `type`: java.lang.String = null
  ): FilePropertyBag = {
    val __obj = js.Dynamic.literal()
    if (endings != null) __obj.updateDynamic("endings")(endings.asInstanceOf[js.Any])
    if (!js.isUndefined(lastModified)) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePropertyBag]
  }
}
