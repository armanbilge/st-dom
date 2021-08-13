package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationFrameProvider extends StObject {
  
  def cancelAnimationFrame(handle: Double): Unit = js.native
  
  def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
}
object AnimationFrameProvider {
  
  @scala.inline
  def apply(cancelAnimationFrame: Double => Unit, requestAnimationFrame: FrameRequestCallback => Double): AnimationFrameProvider = {
    val __obj = js.Dynamic.literal(cancelAnimationFrame = js.Any.fromFunction1(cancelAnimationFrame), requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame))
    __obj.asInstanceOf[AnimationFrameProvider]
  }
}
