package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object used to filter the nodes in a NodeIterator or TreeWalker. They don't know anything about the DOM or how to traverse nodes; they just know how to evaluate a single node against the provided filter. */
@js.native
trait NodeFilter extends StObject {
  
  def acceptNode(node: Node): Double = js.native
}
object NodeFilter {
  
  @scala.inline
  def apply(acceptNode: Node => Double): NodeFilter = {
    val __obj = js.Dynamic.literal(acceptNode = js.Any.fromFunction1(acceptNode))
    __obj.asInstanceOf[NodeFilter]
  }
}
