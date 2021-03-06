package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeolocationPosition extends StObject {
  
  val coords: GeolocationCoordinates = js.native
  
  val timestamp: Double = js.native
}
object GeolocationPosition {
  
  @scala.inline
  def apply(coords: GeolocationCoordinates, timestamp: Double): GeolocationPosition = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationPosition]
  }
}
