package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkStyle extends StObject {
  
  val sheet: CSSStyleSheet | Null = js.native
}
object LinkStyle {
  
  @scala.inline
  def apply(sheet: CSSStyleSheet = null): LinkStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sheet")(if (sheet != null) sheet.asInstanceOf[CSSStyleSheet].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[LinkStyle]
  }
}
