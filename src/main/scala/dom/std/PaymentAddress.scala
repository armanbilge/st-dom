package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Payment Request API interface is used to store shipping or payment address information. */
@js.native
trait PaymentAddress extends StObject {
  
  val addressLine: js.Array[java.lang.String] = js.native
  
  val city: java.lang.String = js.native
  
  val country: java.lang.String = js.native
  
  val dependentLocality: java.lang.String = js.native
  
  val organization: java.lang.String = js.native
  
  val phone: java.lang.String = js.native
  
  val postalCode: java.lang.String = js.native
  
  val recipient: java.lang.String = js.native
  
  val region: java.lang.String = js.native
  
  val sortingCode: java.lang.String = js.native
  
  def toJSON(): js.Any = js.native
}
object PaymentAddress {
  
  @scala.inline
  def apply(
    addressLine: js.Array[java.lang.String],
    city: java.lang.String,
    country: java.lang.String,
    dependentLocality: java.lang.String,
    organization: java.lang.String,
    phone: java.lang.String,
    postalCode: java.lang.String,
    recipient: java.lang.String,
    region: java.lang.String,
    sortingCode: java.lang.String,
    toJSON: () => js.Any
  ): PaymentAddress = {
    val __obj = js.Dynamic.literal(addressLine = addressLine.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], dependentLocality = dependentLocality.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], sortingCode = sortingCode.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[PaymentAddress]
  }
}
