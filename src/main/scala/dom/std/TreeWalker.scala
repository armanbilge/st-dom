package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The nodes of a document subtree and a position within them. */
@js.native
trait TreeWalker extends StObject {
  
  var currentNode: Node = js.native
  
  val filter: NodeFilter | Null = js.native
  
  def firstChild(): Node | Null = js.native
  
  def lastChild(): Node | Null = js.native
  
  def nextNode(): Node | Null = js.native
  
  def nextSibling(): Node | Null = js.native
  
  def parentNode(): Node | Null = js.native
  
  def previousNode(): Node | Null = js.native
  
  def previousSibling(): Node | Null = js.native
  
  val root: Node = js.native
  
  val whatToShow: Double = js.native
}
object TreeWalker {
  
  @scala.inline
  def apply(
    currentNode: Node,
    firstChild: () => Node | Null,
    lastChild: () => Node | Null,
    nextNode: () => Node | Null,
    nextSibling: () => Node | Null,
    parentNode: () => Node | Null,
    previousNode: () => Node | Null,
    previousSibling: () => Node | Null,
    root: Node,
    whatToShow: Double,
    filter: NodeFilter = null
  ): TreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], firstChild = js.Any.fromFunction0(firstChild), lastChild = js.Any.fromFunction0(lastChild), nextNode = js.Any.fromFunction0(nextNode), nextSibling = js.Any.fromFunction0(nextSibling), parentNode = js.Any.fromFunction0(parentNode), previousNode = js.Any.fromFunction0(previousNode), previousSibling = js.Any.fromFunction0(previousSibling), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("filter")(if (filter != null) filter.asInstanceOf[NodeFilter].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[TreeWalker]
  }
}
