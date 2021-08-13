package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaretPosition extends StObject {
  
  def getClientRect(): DOMRect | Null = js.native
  
  val offset: Double = js.native
  
  val offsetNode: Node = js.native
}
object CaretPosition {
  
  @scala.inline
  def apply(getClientRect: () => DOMRect | Null, offset: Double, offsetNode: Node): CaretPosition = {
    val __obj = js.Dynamic.literal(getClientRect = js.Any.fromFunction0(getClientRect), offset = offset.asInstanceOf[js.Any], offsetNode = offsetNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaretPosition]
  }
}
