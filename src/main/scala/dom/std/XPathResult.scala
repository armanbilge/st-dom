package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The results generated by evaluating an XPath expression within the context of a given node. */
@js.native
trait XPathResult extends StObject {
  
  val ANY_TYPE: Double = js.native
  
  val ANY_UNORDERED_NODE_TYPE: Double = js.native
  
  val BOOLEAN_TYPE: Double = js.native
  
  val FIRST_ORDERED_NODE_TYPE: Double = js.native
  
  val NUMBER_TYPE: Double = js.native
  
  val ORDERED_NODE_ITERATOR_TYPE: Double = js.native
  
  val ORDERED_NODE_SNAPSHOT_TYPE: Double = js.native
  
  val STRING_TYPE: Double = js.native
  
  val UNORDERED_NODE_ITERATOR_TYPE: Double = js.native
  
  val UNORDERED_NODE_SNAPSHOT_TYPE: Double = js.native
  
  val booleanValue: scala.Boolean = js.native
  
  val invalidIteratorState: scala.Boolean = js.native
  
  def iterateNext(): Node | Null = js.native
  
  val numberValue: Double = js.native
  
  val resultType: Double = js.native
  
  val singleNodeValue: Node | Null = js.native
  
  def snapshotItem(index: Double): Node | Null = js.native
  
  val snapshotLength: Double = js.native
  
  val stringValue: java.lang.String = js.native
}
object XPathResult {
  
  @scala.inline
  def apply(
    ANY_TYPE: Double,
    ANY_UNORDERED_NODE_TYPE: Double,
    BOOLEAN_TYPE: Double,
    FIRST_ORDERED_NODE_TYPE: Double,
    NUMBER_TYPE: Double,
    ORDERED_NODE_ITERATOR_TYPE: Double,
    ORDERED_NODE_SNAPSHOT_TYPE: Double,
    STRING_TYPE: Double,
    UNORDERED_NODE_ITERATOR_TYPE: Double,
    UNORDERED_NODE_SNAPSHOT_TYPE: Double,
    booleanValue: scala.Boolean,
    invalidIteratorState: scala.Boolean,
    iterateNext: () => Node | Null,
    numberValue: Double,
    resultType: Double,
    snapshotItem: Double => Node | Null,
    snapshotLength: Double,
    stringValue: java.lang.String,
    singleNodeValue: Node = null
  ): XPathResult = {
    val __obj = js.Dynamic.literal(ANY_TYPE = ANY_TYPE.asInstanceOf[js.Any], ANY_UNORDERED_NODE_TYPE = ANY_UNORDERED_NODE_TYPE.asInstanceOf[js.Any], BOOLEAN_TYPE = BOOLEAN_TYPE.asInstanceOf[js.Any], FIRST_ORDERED_NODE_TYPE = FIRST_ORDERED_NODE_TYPE.asInstanceOf[js.Any], NUMBER_TYPE = NUMBER_TYPE.asInstanceOf[js.Any], ORDERED_NODE_ITERATOR_TYPE = ORDERED_NODE_ITERATOR_TYPE.asInstanceOf[js.Any], ORDERED_NODE_SNAPSHOT_TYPE = ORDERED_NODE_SNAPSHOT_TYPE.asInstanceOf[js.Any], STRING_TYPE = STRING_TYPE.asInstanceOf[js.Any], UNORDERED_NODE_ITERATOR_TYPE = UNORDERED_NODE_ITERATOR_TYPE.asInstanceOf[js.Any], UNORDERED_NODE_SNAPSHOT_TYPE = UNORDERED_NODE_SNAPSHOT_TYPE.asInstanceOf[js.Any], booleanValue = booleanValue.asInstanceOf[js.Any], invalidIteratorState = invalidIteratorState.asInstanceOf[js.Any], iterateNext = js.Any.fromFunction0(iterateNext), numberValue = numberValue.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any], snapshotItem = js.Any.fromFunction1(snapshotItem), snapshotLength = snapshotLength.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    __obj.updateDynamic("singleNodeValue")(if (singleNodeValue != null) singleNodeValue.asInstanceOf[Node].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[XPathResult]
  }
}
