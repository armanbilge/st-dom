package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonDocumentTypeChildNode extends StObject {
  
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  val nextElementSibling: Element | Null = js.native
  
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  val previousElementSibling: Element | Null = js.native
}
object NonDocumentTypeChildNode {
  
  @scala.inline
  def apply(nextElementSibling: Element = null, previousElementSibling: Element = null): NonDocumentTypeChildNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nextElementSibling")(if (nextElementSibling != null) nextElementSibling.asInstanceOf[Element].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("previousElementSibling")(if (previousElementSibling != null) previousElementSibling.asInstanceOf[Element].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[NonDocumentTypeChildNode]
  }
}
