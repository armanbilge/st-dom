package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyCredentialUserEntity
  extends StObject
     with PublicKeyCredentialEntity {
  
  var displayName: java.lang.String = js.native
  
  var id: BufferSource = js.native
}
object PublicKeyCredentialUserEntity {
  
  @scala.inline
  def apply(displayName: java.lang.String, id: BufferSource, name: java.lang.String): PublicKeyCredentialUserEntity = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialUserEntity]
  }
}
