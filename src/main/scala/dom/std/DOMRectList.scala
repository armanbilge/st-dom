package dom.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMRectList
  extends StObject
     with /* index */ NumberDictionary[DOMRect] {
  
  def item(index: Double): DOMRect | Null = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[DOMRect]] = js.native
  
  val length: Double = js.native
}
