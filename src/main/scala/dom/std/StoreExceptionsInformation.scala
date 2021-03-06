package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreExceptionsInformation
  extends StObject
     with ExceptionInformation {
  
  var detailURI: js.UndefOr[java.lang.String | Null] = js.native
  
  var explanationString: js.UndefOr[java.lang.String | Null] = js.native
  
  var siteName: js.UndefOr[java.lang.String | Null] = js.native
}
object StoreExceptionsInformation {
  
  @scala.inline
  def apply(
    detailURI: js.UndefOr[Null | java.lang.String] = js.undefined,
    domain: js.UndefOr[Null | java.lang.String] = js.undefined,
    explanationString: js.UndefOr[Null | java.lang.String] = js.undefined,
    siteName: js.UndefOr[Null | java.lang.String] = js.undefined
  ): StoreExceptionsInformation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detailURI)) __obj.updateDynamic("detailURI")(detailURI.asInstanceOf[js.Any])
    if (!js.isUndefined(domain)) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(explanationString)) __obj.updateDynamic("explanationString")(explanationString.asInstanceOf[js.Any])
    if (!js.isUndefined(siteName)) __obj.updateDynamic("siteName")(siteName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreExceptionsInformation]
  }
}
