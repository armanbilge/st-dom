package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGElementInstanceList extends StObject {
  
  /** @deprecated */
  def item(index: Double): SVGElementInstance = js.native
  
  /** @deprecated */
  val length: Double = js.native
}
object SVGElementInstanceList {
  
  @scala.inline
  def apply(item: Double => SVGElementInstance, length: Double): SVGElementInstanceList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGElementInstanceList]
  }
}
