package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WEBGLDebugShaders extends StObject {
  
  def getTranslatedShaderSource(shader: WebGLShader): java.lang.String = js.native
}
object WEBGLDebugShaders {
  
  @scala.inline
  def apply(getTranslatedShaderSource: WebGLShader => java.lang.String): WEBGLDebugShaders = {
    val __obj = js.Dynamic.literal(getTranslatedShaderSource = js.Any.fromFunction1(getTranslatedShaderSource))
    __obj.asInstanceOf[WEBGLDebugShaders]
  }
}
