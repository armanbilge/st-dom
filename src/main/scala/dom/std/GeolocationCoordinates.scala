package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeolocationCoordinates extends StObject {
  
  val accuracy: Double = js.native
  
  val altitude: Double | Null = js.native
  
  val altitudeAccuracy: Double | Null = js.native
  
  val heading: Double | Null = js.native
  
  val latitude: Double = js.native
  
  val longitude: Double = js.native
  
  val speed: Double | Null = js.native
}
object GeolocationCoordinates {
  
  @scala.inline
  def apply(
    accuracy: Double,
    latitude: Double,
    longitude: Double,
    altitude: Double = null.asInstanceOf[Double],
    altitudeAccuracy: Double = null.asInstanceOf[Double],
    heading: Double = null.asInstanceOf[Double],
    speed: Double = null.asInstanceOf[Double]
  ): GeolocationCoordinates = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.updateDynamic("altitude")(if (altitude != null) altitude.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("altitudeAccuracy")(if (altitudeAccuracy != null) altitudeAccuracy.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("heading")(if (heading != null) heading.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("speed")(if (speed != null) speed.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[GeolocationCoordinates]
  }
}
