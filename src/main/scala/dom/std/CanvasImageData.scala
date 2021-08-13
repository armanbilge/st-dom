package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasImageData extends StObject {
  
  def createImageData(imagedata: ImageData): ImageData = js.native
  def createImageData(sw: Double, sh: Double): ImageData = js.native
  
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData = js.native
  
  def putImageData(imagedata: ImageData, dx: Double, dy: Double): Unit = js.native
  def putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: Double,
    dirtyY: Double,
    dirtyWidth: Double,
    dirtyHeight: Double
  ): Unit = js.native
}
