package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The EXT_texture_filter_anisotropic extension is part of the WebGL API and exposes two constants for anisotropic filtering (AF). */
@js.native
trait EXTTextureFilterAnisotropic extends StObject {
  
  val MAX_TEXTURE_MAX_ANISOTROPY_EXT: GLenum = js.native
  
  val TEXTURE_MAX_ANISOTROPY_EXT: GLenum = js.native
}
object EXTTextureFilterAnisotropic {
  
  @scala.inline
  def apply(MAX_TEXTURE_MAX_ANISOTROPY_EXT: GLenum, TEXTURE_MAX_ANISOTROPY_EXT: GLenum): EXTTextureFilterAnisotropic = {
    val __obj = js.Dynamic.literal(MAX_TEXTURE_MAX_ANISOTROPY_EXT = MAX_TEXTURE_MAX_ANISOTROPY_EXT.asInstanceOf[js.Any], TEXTURE_MAX_ANISOTROPY_EXT = TEXTURE_MAX_ANISOTROPY_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTTextureFilterAnisotropic]
  }
}
