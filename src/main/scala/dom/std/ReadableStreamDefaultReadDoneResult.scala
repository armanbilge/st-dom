package dom.std

import dom.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamDefaultReadDoneResult
  extends StObject
     with ReadableStreamDefaultReadResult[js.Any] {
  
  var done: `true` = js.native
  
  var value: Unit = js.native
}
object ReadableStreamDefaultReadDoneResult {
  
  @scala.inline
  def apply(value: Unit): ReadableStreamDefaultReadDoneResult = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamDefaultReadDoneResult]
  }
}
