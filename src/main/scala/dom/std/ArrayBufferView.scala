package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayBufferView
  extends StObject
     with BufferSource {
  
  /**
    * The ArrayBuffer instance referenced by the array.
    */
  var buffer: ArrayBufferLike = js.native
  
  /**
    * The length in bytes of the array.
    */
  var byteLength: Double = js.native
  
  /**
    * The offset in bytes of the array.
    */
  var byteOffset: Double = js.native
}
object ArrayBufferView {
  
  @scala.inline
  def apply(buffer: ArrayBufferLike, byteLength: Double, byteOffset: Double): ArrayBufferView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferView]
  }
}
