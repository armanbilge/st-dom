package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSGesture extends StObject {
  
  def addPointer(pointerId: Double): Unit = js.native
  
  def stop(): Unit = js.native
  
  var target: Element = js.native
}
object MSGesture {
  
  @scala.inline
  def apply(addPointer: Double => Unit, stop: () => Unit, target: Element): MSGesture = {
    val __obj = js.Dynamic.literal(addPointer = js.Any.fromFunction1(addPointer), stop = js.Any.fromFunction0(stop), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSGesture]
  }
}
