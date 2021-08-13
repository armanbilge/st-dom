package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyCredentialRpEntity
  extends StObject
     with PublicKeyCredentialEntity {
  
  var id: js.UndefOr[java.lang.String] = js.native
}
object PublicKeyCredentialRpEntity {
  
  @scala.inline
  def apply(name: java.lang.String, id: java.lang.String = null): PublicKeyCredentialRpEntity = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRpEntity]
  }
}
