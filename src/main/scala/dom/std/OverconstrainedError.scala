package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverconstrainedError
  extends StObject
     with Error {
  
  var constraint: java.lang.String = js.native
}
object OverconstrainedError {
  
  @scala.inline
  def apply(
    constraint: java.lang.String,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): OverconstrainedError = {
    val __obj = js.Dynamic.literal(constraint = constraint.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverconstrainedError]
  }
}
