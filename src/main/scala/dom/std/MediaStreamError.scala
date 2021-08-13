package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamError extends StObject {
  
  val constraintName: java.lang.String | Null = js.native
  
  val message: java.lang.String | Null = js.native
  
  val name: java.lang.String = js.native
}
object MediaStreamError {
  
  @scala.inline
  def apply(name: java.lang.String, constraintName: java.lang.String = null, message: java.lang.String = null): MediaStreamError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("constraintName")(if (constraintName != null) constraintName.asInstanceOf[java.lang.String].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("message")(if (message != null) message.asInstanceOf[java.lang.String].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[MediaStreamError]
  }
}
