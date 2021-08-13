package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDecoderCommon extends StObject {
  
  /**
    * Returns encoding's name, lowercased.
    */
  val encoding: java.lang.String = js.native
  
  /**
    * Returns true if error mode is "fatal", otherwise false.
    */
  val fatal: scala.Boolean = js.native
  
  /**
    * Returns the value of ignore BOM.
    */
  val ignoreBOM: scala.Boolean = js.native
}
object TextDecoderCommon {
  
  @scala.inline
  def apply(encoding: java.lang.String, fatal: scala.Boolean, ignoreBOM: scala.Boolean): TextDecoderCommon = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], ignoreBOM = ignoreBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoderCommon]
  }
}
