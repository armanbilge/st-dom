package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A screen, usually the one on which the current window is being rendered, and is obtained using window.screen. */
@js.native
trait Screen extends StObject {
  
  val availHeight: Double = js.native
  
  val availWidth: Double = js.native
  
  val colorDepth: Double = js.native
  
  val height: Double = js.native
  
  val orientation: ScreenOrientation = js.native
  
  val pixelDepth: Double = js.native
  
  val width: Double = js.native
}
object Screen {
  
  @scala.inline
  def apply(
    availHeight: Double,
    availWidth: Double,
    colorDepth: Double,
    height: Double,
    orientation: ScreenOrientation,
    pixelDepth: Double,
    width: Double
  ): Screen = {
    val __obj = js.Dynamic.literal(availHeight = availHeight.asInstanceOf[js.Any], availWidth = availWidth.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pixelDepth = pixelDepth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
}
