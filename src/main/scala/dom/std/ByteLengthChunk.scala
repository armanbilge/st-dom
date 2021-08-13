package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByteLengthChunk extends StObject {
  
  var byteLength: js.UndefOr[Double] = js.native
}
object ByteLengthChunk {
  
  @scala.inline
  def apply(byteLength: js.UndefOr[Double] = js.undefined): ByteLengthChunk = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(byteLength)) __obj.updateDynamic("byteLength")(byteLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteLengthChunk]
  }
}
