package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order. */
@js.native
trait NodeIterator extends StObject {
  
  def detach(): Unit = js.native
  
  val filter: NodeFilter | Null = js.native
  
  def nextNode(): Node | Null = js.native
  
  val pointerBeforeReferenceNode: scala.Boolean = js.native
  
  def previousNode(): Node | Null = js.native
  
  val referenceNode: Node = js.native
  
  val root: Node = js.native
  
  val whatToShow: Double = js.native
}
object NodeIterator {
  
  @scala.inline
  def apply(
    detach: () => Unit,
    nextNode: () => Node | Null,
    pointerBeforeReferenceNode: scala.Boolean,
    previousNode: () => Node | Null,
    referenceNode: Node,
    root: Node,
    whatToShow: Double,
    filter: NodeFilter = null
  ): NodeIterator = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), nextNode = js.Any.fromFunction0(nextNode), pointerBeforeReferenceNode = pointerBeforeReferenceNode.asInstanceOf[js.Any], previousNode = js.Any.fromFunction0(previousNode), referenceNode = referenceNode.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("filter")(if (filter != null) filter.asInstanceOf[NodeFilter].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[NodeIterator]
  }
}
