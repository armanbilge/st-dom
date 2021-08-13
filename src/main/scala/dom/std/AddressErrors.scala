package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressErrors extends StObject {
  
  var addressLine: js.UndefOr[java.lang.String] = js.native
  
  var city: js.UndefOr[java.lang.String] = js.native
  
  var country: js.UndefOr[java.lang.String] = js.native
  
  var dependentLocality: js.UndefOr[java.lang.String] = js.native
  
  var organization: js.UndefOr[java.lang.String] = js.native
  
  var phone: js.UndefOr[java.lang.String] = js.native
  
  var postalCode: js.UndefOr[java.lang.String] = js.native
  
  var recipient: js.UndefOr[java.lang.String] = js.native
  
  var region: js.UndefOr[java.lang.String] = js.native
  
  var sortingCode: js.UndefOr[java.lang.String] = js.native
}
object AddressErrors {
  
  @scala.inline
  def apply(
    addressLine: java.lang.String = null,
    city: java.lang.String = null,
    country: java.lang.String = null,
    dependentLocality: java.lang.String = null,
    organization: java.lang.String = null,
    phone: java.lang.String = null,
    postalCode: java.lang.String = null,
    recipient: java.lang.String = null,
    region: java.lang.String = null,
    sortingCode: java.lang.String = null
  ): AddressErrors = {
    val __obj = js.Dynamic.literal()
    if (addressLine != null) __obj.updateDynamic("addressLine")(addressLine.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (dependentLocality != null) __obj.updateDynamic("dependentLocality")(dependentLocality.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (sortingCode != null) __obj.updateDynamic("sortingCode")(sortingCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressErrors]
  }
}
