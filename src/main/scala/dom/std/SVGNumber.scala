package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <number> basic data type. */
@js.native
trait SVGNumber extends StObject {
  
  var value: Double = js.native
}
object SVGNumber {
  
  @scala.inline
  def apply(value: Double): SVGNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGNumber]
  }
}
