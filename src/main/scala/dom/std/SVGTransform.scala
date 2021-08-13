package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute. */
@js.native
trait SVGTransform extends StObject {
  
  val SVG_TRANSFORM_MATRIX: Double = js.native
  
  val SVG_TRANSFORM_ROTATE: Double = js.native
  
  val SVG_TRANSFORM_SCALE: Double = js.native
  
  val SVG_TRANSFORM_SKEWX: Double = js.native
  
  val SVG_TRANSFORM_SKEWY: Double = js.native
  
  val SVG_TRANSFORM_TRANSLATE: Double = js.native
  
  val SVG_TRANSFORM_UNKNOWN: Double = js.native
  
  val angle: Double = js.native
  
  val matrix: SVGMatrix = js.native
  
  def setMatrix(matrix: SVGMatrix): Unit = js.native
  
  def setRotate(angle: Double, cx: Double, cy: Double): Unit = js.native
  
  def setScale(sx: Double, sy: Double): Unit = js.native
  
  def setSkewX(angle: Double): Unit = js.native
  
  def setSkewY(angle: Double): Unit = js.native
  
  def setTranslate(tx: Double, ty: Double): Unit = js.native
  
  val `type`: Double = js.native
}
object SVGTransform {
  
  @scala.inline
  def apply(
    SVG_TRANSFORM_MATRIX: Double,
    SVG_TRANSFORM_ROTATE: Double,
    SVG_TRANSFORM_SCALE: Double,
    SVG_TRANSFORM_SKEWX: Double,
    SVG_TRANSFORM_SKEWY: Double,
    SVG_TRANSFORM_TRANSLATE: Double,
    SVG_TRANSFORM_UNKNOWN: Double,
    angle: Double,
    matrix: SVGMatrix,
    setMatrix: SVGMatrix => Unit,
    setRotate: (Double, Double, Double) => Unit,
    setScale: (Double, Double) => Unit,
    setSkewX: Double => Unit,
    setSkewY: Double => Unit,
    setTranslate: (Double, Double) => Unit,
    `type`: Double
  ): SVGTransform = {
    val __obj = js.Dynamic.literal(SVG_TRANSFORM_MATRIX = SVG_TRANSFORM_MATRIX.asInstanceOf[js.Any], SVG_TRANSFORM_ROTATE = SVG_TRANSFORM_ROTATE.asInstanceOf[js.Any], SVG_TRANSFORM_SCALE = SVG_TRANSFORM_SCALE.asInstanceOf[js.Any], SVG_TRANSFORM_SKEWX = SVG_TRANSFORM_SKEWX.asInstanceOf[js.Any], SVG_TRANSFORM_SKEWY = SVG_TRANSFORM_SKEWY.asInstanceOf[js.Any], SVG_TRANSFORM_TRANSLATE = SVG_TRANSFORM_TRANSLATE.asInstanceOf[js.Any], SVG_TRANSFORM_UNKNOWN = SVG_TRANSFORM_UNKNOWN.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], setMatrix = js.Any.fromFunction1(setMatrix), setRotate = js.Any.fromFunction3(setRotate), setScale = js.Any.fromFunction2(setScale), setSkewX = js.Any.fromFunction1(setSkewX), setSkewY = js.Any.fromFunction1(setSkewY), setTranslate = js.Any.fromFunction2(setTranslate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTransform]
  }
}
