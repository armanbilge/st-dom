package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A MutationRecord represents an individual DOM mutation. It is the object that is passed to MutationObserver's callback. */
@js.native
trait MutationRecord extends StObject {
  
  /**
    * Return the nodes added and removed respectively.
    */
  val addedNodes: NodeList = js.native
  
  /**
    * Returns the local name of the changed attribute, and null otherwise.
    */
  val attributeName: java.lang.String | Null = js.native
  
  /**
    * Returns the namespace of the changed attribute, and null otherwise.
    */
  val attributeNamespace: java.lang.String | Null = js.native
  
  /**
    * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
    */
  val nextSibling: Node | Null = js.native
  
  /**
    * The return value depends on type. For "attributes", it is the value of the changed attribute before the change. For "characterData", it is the data of the changed node before the change. For "childList", it is null.
    */
  val oldValue: java.lang.String | Null = js.native
  
  /**
    * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
    */
  val previousSibling: Node | Null = js.native
  
  /**
    * Return the nodes added and removed respectively.
    */
  val removedNodes: NodeList = js.native
  
  /**
    * Returns the node the mutation affected, depending on the type. For "attributes", it is the element whose attribute changed. For "characterData", it is the CharacterData node. For "childList", it is the node whose children changed.
    */
  val target: Node = js.native
  
  /**
    * Returns "attributes" if it was an attribute mutation. "characterData" if it was a mutation to a CharacterData node. And "childList" if it was a mutation to the tree of nodes.
    */
  val `type`: MutationRecordType = js.native
}
object MutationRecord {
  
  @scala.inline
  def apply(
    addedNodes: NodeList,
    removedNodes: NodeList,
    target: Node,
    `type`: MutationRecordType,
    attributeName: java.lang.String = null,
    attributeNamespace: java.lang.String = null,
    nextSibling: Node = null,
    oldValue: java.lang.String = null,
    previousSibling: Node = null
  ): MutationRecord = {
    val __obj = js.Dynamic.literal(addedNodes = addedNodes.asInstanceOf[js.Any], removedNodes = removedNodes.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("attributeName")(if (attributeName != null) attributeName.asInstanceOf[java.lang.String].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("attributeNamespace")(if (attributeNamespace != null) attributeNamespace.asInstanceOf[java.lang.String].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("nextSibling")(if (nextSibling != null) nextSibling.asInstanceOf[Node].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("oldValue")(if (oldValue != null) oldValue.asInstanceOf[java.lang.String].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("previousSibling")(if (previousSibling != null) previousSibling.asInstanceOf[Node].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[MutationRecord]
  }
}
