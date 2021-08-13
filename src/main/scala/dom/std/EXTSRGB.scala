package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EXTSRGB extends StObject {
  
  val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: GLenum = js.native
  
  val SRGB8_ALPHA8_EXT: GLenum = js.native
  
  val SRGB_ALPHA_EXT: GLenum = js.native
  
  val SRGB_EXT: GLenum = js.native
}
object EXTSRGB {
  
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: GLenum,
    SRGB8_ALPHA8_EXT: GLenum,
    SRGB_ALPHA_EXT: GLenum,
    SRGB_EXT: GLenum
  ): EXTSRGB = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT = FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT.asInstanceOf[js.Any], SRGB8_ALPHA8_EXT = SRGB8_ALPHA8_EXT.asInstanceOf[js.Any], SRGB_ALPHA_EXT = SRGB_ALPHA_EXT.asInstanceOf[js.Any], SRGB_EXT = SRGB_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTSRGB]
  }
}
