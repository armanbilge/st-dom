package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLContextAttributes extends StObject {
  
  var alpha: js.UndefOr[scala.Boolean] = js.native
  
  var antialias: js.UndefOr[scala.Boolean] = js.native
  
  var depth: js.UndefOr[scala.Boolean] = js.native
  
  var desynchronized: js.UndefOr[scala.Boolean] = js.native
  
  var failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.native
  
  var powerPreference: js.UndefOr[WebGLPowerPreference] = js.native
  
  var premultipliedAlpha: js.UndefOr[scala.Boolean] = js.native
  
  var preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.native
  
  var stencil: js.UndefOr[scala.Boolean] = js.native
}
object WebGLContextAttributes {
  
  @scala.inline
  def apply(
    alpha: js.UndefOr[scala.Boolean] = js.undefined,
    antialias: js.UndefOr[scala.Boolean] = js.undefined,
    depth: js.UndefOr[scala.Boolean] = js.undefined,
    desynchronized: js.UndefOr[scala.Boolean] = js.undefined,
    failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined,
    powerPreference: WebGLPowerPreference = null,
    premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined,
    preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    stencil: js.UndefOr[scala.Boolean] = js.undefined
  ): WebGLContextAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(desynchronized)) __obj.updateDynamic("desynchronized")(desynchronized.asInstanceOf[js.Any])
    if (!js.isUndefined(failIfMajorPerformanceCaveat)) __obj.updateDynamic("failIfMajorPerformanceCaveat")(failIfMajorPerformanceCaveat.asInstanceOf[js.Any])
    if (powerPreference != null) __obj.updateDynamic("powerPreference")(powerPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(stencil)) __obj.updateDynamic("stencil")(stencil.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLContextAttributes]
  }
}
