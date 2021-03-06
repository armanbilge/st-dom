package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The WEBGL_debug_renderer_info extension is part of the WebGL API and exposes two constants with information about the graphics driver for debugging purposes. */
@js.native
trait WEBGLDebugRendererInfo extends StObject {
  
  val UNMASKED_RENDERER_WEBGL: GLenum = js.native
  
  val UNMASKED_VENDOR_WEBGL: GLenum = js.native
}
object WEBGLDebugRendererInfo {
  
  @scala.inline
  def apply(UNMASKED_RENDERER_WEBGL: GLenum, UNMASKED_VENDOR_WEBGL: GLenum): WEBGLDebugRendererInfo = {
    val __obj = js.Dynamic.literal(UNMASKED_RENDERER_WEBGL = UNMASKED_RENDERER_WEBGL.asInstanceOf[js.Any], UNMASKED_VENDOR_WEBGL = UNMASKED_VENDOR_WEBGL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLDebugRendererInfo]
  }
}
