package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends StObject {
  
  var message: java.lang.String = js.native
  
  var name: java.lang.String = js.native
  
  var stack: js.UndefOr[java.lang.String] = js.native
}
object Error {
  
  @scala.inline
  def apply(message: java.lang.String, name: java.lang.String, stack: java.lang.String = null): Error = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}
