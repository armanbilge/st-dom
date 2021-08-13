package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol extends StObject {
  
  /**
    * Converts a Symbol object to a symbol.
    */
  @JSName(js.Symbol.toPrimitive)
  var toPrimitive: js.Function1[/* hint */ java.lang.String, js.Symbol] = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
}
