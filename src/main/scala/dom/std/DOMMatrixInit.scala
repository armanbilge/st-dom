package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMMatrixInit
  extends StObject
     with DOMMatrix2DInit {
  
  var is2D: js.UndefOr[scala.Boolean] = js.native
  
  var m13: js.UndefOr[Double] = js.native
  
  var m14: js.UndefOr[Double] = js.native
  
  var m23: js.UndefOr[Double] = js.native
  
  var m24: js.UndefOr[Double] = js.native
  
  var m31: js.UndefOr[Double] = js.native
  
  var m32: js.UndefOr[Double] = js.native
  
  var m33: js.UndefOr[Double] = js.native
  
  var m34: js.UndefOr[Double] = js.native
  
  var m43: js.UndefOr[Double] = js.native
  
  var m44: js.UndefOr[Double] = js.native
}
object DOMMatrixInit {
  
  @scala.inline
  def apply(
    a: js.UndefOr[Double] = js.undefined,
    b: js.UndefOr[Double] = js.undefined,
    c: js.UndefOr[Double] = js.undefined,
    d: js.UndefOr[Double] = js.undefined,
    e: js.UndefOr[Double] = js.undefined,
    f: js.UndefOr[Double] = js.undefined,
    is2D: js.UndefOr[scala.Boolean] = js.undefined,
    m11: js.UndefOr[Double] = js.undefined,
    m12: js.UndefOr[Double] = js.undefined,
    m13: js.UndefOr[Double] = js.undefined,
    m14: js.UndefOr[Double] = js.undefined,
    m21: js.UndefOr[Double] = js.undefined,
    m22: js.UndefOr[Double] = js.undefined,
    m23: js.UndefOr[Double] = js.undefined,
    m24: js.UndefOr[Double] = js.undefined,
    m31: js.UndefOr[Double] = js.undefined,
    m32: js.UndefOr[Double] = js.undefined,
    m33: js.UndefOr[Double] = js.undefined,
    m34: js.UndefOr[Double] = js.undefined,
    m41: js.UndefOr[Double] = js.undefined,
    m42: js.UndefOr[Double] = js.undefined,
    m43: js.UndefOr[Double] = js.undefined,
    m44: js.UndefOr[Double] = js.undefined
  ): DOMMatrixInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(a)) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (!js.isUndefined(b)) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (!js.isUndefined(c)) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (!js.isUndefined(d)) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (!js.isUndefined(e)) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (!js.isUndefined(f)) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (!js.isUndefined(is2D)) __obj.updateDynamic("is2D")(is2D.asInstanceOf[js.Any])
    if (!js.isUndefined(m11)) __obj.updateDynamic("m11")(m11.asInstanceOf[js.Any])
    if (!js.isUndefined(m12)) __obj.updateDynamic("m12")(m12.asInstanceOf[js.Any])
    if (!js.isUndefined(m13)) __obj.updateDynamic("m13")(m13.asInstanceOf[js.Any])
    if (!js.isUndefined(m14)) __obj.updateDynamic("m14")(m14.asInstanceOf[js.Any])
    if (!js.isUndefined(m21)) __obj.updateDynamic("m21")(m21.asInstanceOf[js.Any])
    if (!js.isUndefined(m22)) __obj.updateDynamic("m22")(m22.asInstanceOf[js.Any])
    if (!js.isUndefined(m23)) __obj.updateDynamic("m23")(m23.asInstanceOf[js.Any])
    if (!js.isUndefined(m24)) __obj.updateDynamic("m24")(m24.asInstanceOf[js.Any])
    if (!js.isUndefined(m31)) __obj.updateDynamic("m31")(m31.asInstanceOf[js.Any])
    if (!js.isUndefined(m32)) __obj.updateDynamic("m32")(m32.asInstanceOf[js.Any])
    if (!js.isUndefined(m33)) __obj.updateDynamic("m33")(m33.asInstanceOf[js.Any])
    if (!js.isUndefined(m34)) __obj.updateDynamic("m34")(m34.asInstanceOf[js.Any])
    if (!js.isUndefined(m41)) __obj.updateDynamic("m41")(m41.asInstanceOf[js.Any])
    if (!js.isUndefined(m42)) __obj.updateDynamic("m42")(m42.asInstanceOf[js.Any])
    if (!js.isUndefined(m43)) __obj.updateDynamic("m43")(m43.asInstanceOf[js.Any])
    if (!js.isUndefined(m44)) __obj.updateDynamic("m44")(m44.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMMatrixInit]
  }
}
