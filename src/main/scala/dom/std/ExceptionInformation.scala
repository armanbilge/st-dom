package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExceptionInformation extends StObject {
  
  var domain: js.UndefOr[java.lang.String | Null] = js.native
}
object ExceptionInformation {
  
  @scala.inline
  def apply(domain: js.UndefOr[Null | java.lang.String] = js.undefined): ExceptionInformation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(domain)) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionInformation]
  }
}
