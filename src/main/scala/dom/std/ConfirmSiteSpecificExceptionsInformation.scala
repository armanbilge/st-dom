package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmSiteSpecificExceptionsInformation
  extends StObject
     with ExceptionInformation {
  
  var arrayOfDomainStrings: js.UndefOr[js.Array[java.lang.String]] = js.native
}
object ConfirmSiteSpecificExceptionsInformation {
  
  @scala.inline
  def apply(
    arrayOfDomainStrings: js.Array[java.lang.String] = null,
    domain: js.UndefOr[Null | java.lang.String] = js.undefined
  ): ConfirmSiteSpecificExceptionsInformation = {
    val __obj = js.Dynamic.literal()
    if (arrayOfDomainStrings != null) __obj.updateDynamic("arrayOfDomainStrings")(arrayOfDomainStrings.asInstanceOf[js.Any])
    if (!js.isUndefined(domain)) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmSiteSpecificExceptionsInformation]
  }
}
