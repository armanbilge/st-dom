package dom.std.global

import dom.std.DOMMatrixInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WebKitCSSMatrix")
@js.native
class WebKitCSSMatrix ()
  extends StObject
     with dom.std.DOMMatrix {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[Double]) = this()
}
/* was `typeof DOMMatrix` */
object WebKitCSSMatrix {
  
  @JSGlobal("WebKitCSSMatrix")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromFloat32Array(array32: dom.std.Float32Array): dom.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat32Array")(array32.asInstanceOf[js.Any]).asInstanceOf[dom.std.DOMMatrix]
  
  @scala.inline
  def fromFloat64Array(array64: dom.std.Float64Array): dom.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat64Array")(array64.asInstanceOf[js.Any]).asInstanceOf[dom.std.DOMMatrix]
  
  @scala.inline
  def fromMatrix(): dom.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")().asInstanceOf[dom.std.DOMMatrix]
  @scala.inline
  def fromMatrix(other: DOMMatrixInit): dom.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")(other.asInstanceOf[js.Any]).asInstanceOf[dom.std.DOMMatrix]
}
