package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowEventHandlersEventMap extends StObject {
  
  var afterprint: Event = js.native
  
  var beforeprint: Event = js.native
  
  var beforeunload: BeforeUnloadEvent = js.native
  
  var hashchange: HashChangeEvent = js.native
  
  var languagechange: Event = js.native
  
  var message: MessageEvent[js.Any] = js.native
  
  var messageerror: MessageEvent[js.Any] = js.native
  
  var offline: Event = js.native
  
  var online: Event = js.native
  
  var pagehide: PageTransitionEvent = js.native
  
  var pageshow: PageTransitionEvent = js.native
  
  var popstate: PopStateEvent = js.native
  
  var rejectionhandled: PromiseRejectionEvent = js.native
  
  var storage: StorageEvent = js.native
  
  var unhandledrejection: PromiseRejectionEvent = js.native
  
  var unload: Event = js.native
}
object WindowEventHandlersEventMap {
  
  @scala.inline
  def apply(
    afterprint: Event,
    beforeprint: Event,
    beforeunload: BeforeUnloadEvent,
    hashchange: HashChangeEvent,
    languagechange: Event,
    message: MessageEvent[js.Any],
    messageerror: MessageEvent[js.Any],
    offline: Event,
    online: Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    popstate: PopStateEvent,
    rejectionhandled: PromiseRejectionEvent,
    storage: StorageEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: Event
  ): WindowEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(afterprint = afterprint.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventHandlersEventMap]
  }
}
