package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractRange extends StObject {
  
  /**
    * Returns true if range is collapsed, and false otherwise.
    */
  val collapsed: scala.Boolean = js.native
  
  /**
    * Returns range's end node.
    */
  val endContainer: Node = js.native
  
  /**
    * Returns range's end offset.
    */
  val endOffset: Double = js.native
  
  /**
    * Returns range's start node.
    */
  val startContainer: Node = js.native
  
  /**
    * Returns range's start offset.
    */
  val startOffset: Double = js.native
}
object AbstractRange {
  
  @scala.inline
  def apply(
    collapsed: scala.Boolean,
    endContainer: Node,
    endOffset: Double,
    startContainer: Node,
    startOffset: Double
  ): AbstractRange = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractRange]
  }
}
