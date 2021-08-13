package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The msGraphicsTrust() constructor returns an object that provides properties for info on protected video playback. */
@js.native
trait MSGraphicsTrust extends StObject {
  
  val constrictionActive: scala.Boolean = js.native
  
  val status: java.lang.String = js.native
}
object MSGraphicsTrust {
  
  @scala.inline
  def apply(constrictionActive: scala.Boolean, status: java.lang.String): MSGraphicsTrust = {
    val __obj = js.Dynamic.literal(constrictionActive = constrictionActive.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSGraphicsTrust]
  }
}
