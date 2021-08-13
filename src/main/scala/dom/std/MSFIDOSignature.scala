package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSFIDOSignature extends StObject {
  
  val authnrData: java.lang.String = js.native
  
  val clientData: java.lang.String = js.native
  
  val signature: java.lang.String = js.native
}
object MSFIDOSignature {
  
  @scala.inline
  def apply(authnrData: java.lang.String, clientData: java.lang.String, signature: java.lang.String): MSFIDOSignature = {
    val __obj = js.Dynamic.literal(authnrData = authnrData.asInstanceOf[js.Any], clientData = clientData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSFIDOSignature]
  }
}
