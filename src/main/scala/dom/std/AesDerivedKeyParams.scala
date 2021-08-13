package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AesDerivedKeyParams
  extends StObject
     with Algorithm {
  
  var length: Double = js.native
}
object AesDerivedKeyParams {
  
  @scala.inline
  def apply(length: Double, name: java.lang.String): AesDerivedKeyParams = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesDerivedKeyParams]
  }
}
