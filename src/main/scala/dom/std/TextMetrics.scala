package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The dimensions of a piece of text in the canvas, as created by the CanvasRenderingContext2D.measureText() method. */
@js.native
trait TextMetrics extends StObject {
  
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxAscent: Double = js.native
  
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxDescent: Double = js.native
  
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxLeft: Double = js.native
  
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxRight: Double = js.native
  
  /**
    * Returns the measurement described below.
    */
  val width: Double = js.native
}
object TextMetrics {
  
  @scala.inline
  def apply(
    actualBoundingBoxAscent: Double,
    actualBoundingBoxDescent: Double,
    actualBoundingBoxLeft: Double,
    actualBoundingBoxRight: Double,
    width: Double
  ): TextMetrics = {
    val __obj = js.Dynamic.literal(actualBoundingBoxAscent = actualBoundingBoxAscent.asInstanceOf[js.Any], actualBoundingBoxDescent = actualBoundingBoxDescent.asInstanceOf[js.Any], actualBoundingBoxLeft = actualBoundingBoxLeft.asInstanceOf[js.Any], actualBoundingBoxRight = actualBoundingBoxRight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMetrics]
  }
}
