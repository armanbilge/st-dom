package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareData extends StObject {
  
  var text: js.UndefOr[java.lang.String] = js.native
  
  var title: js.UndefOr[java.lang.String] = js.native
  
  var url: js.UndefOr[java.lang.String] = js.native
}
object ShareData {
  
  @scala.inline
  def apply(text: java.lang.String = null, title: java.lang.String = null, url: java.lang.String = null): ShareData = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareData]
  }
}
