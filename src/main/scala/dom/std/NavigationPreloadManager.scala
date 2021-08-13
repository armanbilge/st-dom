package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationPreloadManager extends StObject {
  
  def disable(): js.Promise[Unit] = js.native
  
  def enable(): js.Promise[Unit] = js.native
  
  def getState(): js.Promise[NavigationPreloadState] = js.native
  
  def setHeaderValue(value: java.lang.String): js.Promise[Unit] = js.native
}
object NavigationPreloadManager {
  
  @scala.inline
  def apply(
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    getState: () => js.Promise[NavigationPreloadState],
    setHeaderValue: java.lang.String => js.Promise[Unit]
  ): NavigationPreloadManager = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getState = js.Any.fromFunction0(getState), setHeaderValue = js.Any.fromFunction1(setHeaderValue))
    __obj.asInstanceOf[NavigationPreloadManager]
  }
}
