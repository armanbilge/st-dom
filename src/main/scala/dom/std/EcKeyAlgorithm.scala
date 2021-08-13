package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EcKeyAlgorithm
  extends StObject
     with KeyAlgorithm {
  
  var namedCurve: NamedCurve = js.native
}
object EcKeyAlgorithm {
  
  @scala.inline
  def apply(name: java.lang.String, namedCurve: NamedCurve): EcKeyAlgorithm = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namedCurve = namedCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcKeyAlgorithm]
  }
}
