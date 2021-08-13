package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceBufferListEventMap extends StObject {
  
  var addsourcebuffer: Event = js.native
  
  var removesourcebuffer: Event = js.native
}
object SourceBufferListEventMap {
  
  @scala.inline
  def apply(addsourcebuffer: Event, removesourcebuffer: Event): SourceBufferListEventMap = {
    val __obj = js.Dynamic.literal(addsourcebuffer = addsourcebuffer.asInstanceOf[js.Any], removesourcebuffer = removesourcebuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferListEventMap]
  }
}
