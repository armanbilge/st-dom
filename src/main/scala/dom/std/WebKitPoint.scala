package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebKitPoint extends StObject {
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object WebKitPoint {
  
  @scala.inline
  def apply(x: Double, y: Double): WebKitPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebKitPoint]
  }
}
