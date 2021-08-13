package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentOrShadowRoot extends StObject {
  
  val activeElement: Element | Null = js.native
  
  def caretPositionFromPoint(x: Double, y: Double): CaretPosition | Null = js.native
  
  /** @deprecated */
  def caretRangeFromPoint(x: Double, y: Double): Range = js.native
  
  def elementFromPoint(x: Double, y: Double): Element | Null = js.native
  
  def elementsFromPoint(x: Double, y: Double): js.Array[Element] = js.native
  
  /**
    * Returns document's fullscreen element.
    */
  val fullscreenElement: Element | Null = js.native
  
  def getSelection(): Selection | Null = js.native
  
  val pointerLockElement: Element | Null = js.native
  
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  val styleSheets: StyleSheetList = js.native
}
object DocumentOrShadowRoot {
  
  @scala.inline
  def apply(
    caretPositionFromPoint: (Double, Double) => CaretPosition | Null,
    caretRangeFromPoint: (Double, Double) => Range,
    elementFromPoint: (Double, Double) => Element | Null,
    elementsFromPoint: (Double, Double) => js.Array[Element],
    getSelection: () => Selection | Null,
    styleSheets: StyleSheetList,
    activeElement: Element = null,
    fullscreenElement: Element = null,
    pointerLockElement: Element = null
  ): DocumentOrShadowRoot = {
    val __obj = js.Dynamic.literal(caretPositionFromPoint = js.Any.fromFunction2(caretPositionFromPoint), caretRangeFromPoint = js.Any.fromFunction2(caretRangeFromPoint), elementFromPoint = js.Any.fromFunction2(elementFromPoint), elementsFromPoint = js.Any.fromFunction2(elementsFromPoint), getSelection = js.Any.fromFunction0(getSelection), styleSheets = styleSheets.asInstanceOf[js.Any])
    __obj.updateDynamic("activeElement")(if (activeElement != null) activeElement.asInstanceOf[Element].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("fullscreenElement")(if (fullscreenElement != null) fullscreenElement.asInstanceOf[Element].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("pointerLockElement")(if (pointerLockElement != null) pointerLockElement.asInstanceOf[Element].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[DocumentOrShadowRoot]
  }
}
