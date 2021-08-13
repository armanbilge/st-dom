package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasUserInterface extends StObject {
  
  def drawFocusIfNeeded(element: Element): Unit = js.native
  def drawFocusIfNeeded(path: Path2D, element: Element): Unit = js.native
  
  def scrollPathIntoView(): Unit = js.native
  def scrollPathIntoView(path: Path2D): Unit = js.native
}
