package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorID extends StObject {
  
  val appCodeName: java.lang.String = js.native
  
  val appName: java.lang.String = js.native
  
  val appVersion: java.lang.String = js.native
  
  val platform: java.lang.String = js.native
  
  val product: java.lang.String = js.native
  
  val productSub: java.lang.String = js.native
  
  val userAgent: java.lang.String = js.native
  
  val vendor: java.lang.String = js.native
  
  val vendorSub: java.lang.String = js.native
}
object NavigatorID {
  
  @scala.inline
  def apply(
    appCodeName: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    platform: java.lang.String,
    product: java.lang.String,
    productSub: java.lang.String,
    userAgent: java.lang.String,
    vendor: java.lang.String,
    vendorSub: java.lang.String
  ): NavigatorID = {
    val __obj = js.Dynamic.literal(appCodeName = appCodeName.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], productSub = productSub.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vendorSub = vendorSub.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorID]
  }
}
