package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGZoomAndPan extends StObject {
  
  val SVG_ZOOMANDPAN_DISABLE: Double = js.native
  
  val SVG_ZOOMANDPAN_MAGNIFY: Double = js.native
  
  val SVG_ZOOMANDPAN_UNKNOWN: Double = js.native
  
  var zoomAndPan: Double = js.native
}
object SVGZoomAndPan {
  
  @scala.inline
  def apply(
    SVG_ZOOMANDPAN_DISABLE: Double,
    SVG_ZOOMANDPAN_MAGNIFY: Double,
    SVG_ZOOMANDPAN_UNKNOWN: Double,
    zoomAndPan: Double
  ): SVGZoomAndPan = {
    val __obj = js.Dynamic.literal(SVG_ZOOMANDPAN_DISABLE = SVG_ZOOMANDPAN_DISABLE.asInstanceOf[js.Any], SVG_ZOOMANDPAN_MAGNIFY = SVG_ZOOMANDPAN_MAGNIFY.asInstanceOf[js.Any], SVG_ZOOMANDPAN_UNKNOWN = SVG_ZOOMANDPAN_UNKNOWN.asInstanceOf[js.Any], zoomAndPan = zoomAndPan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGZoomAndPan]
  }
}
