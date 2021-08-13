package dom.std

import dom.std.stdStrings.devicechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to connected media input devices like cameras and microphones, as well as screen sharing. In essence, it lets you obtain access to any hardware source of media data. */
@js.native
trait MediaDevices
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_devicechange(`type`: devicechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  def enumerateDevices(): js.Promise[js.Array[MediaDeviceInfo]] = js.native
  
  def getSupportedConstraints(): MediaTrackSupportedConstraints = js.native
  
  def getUserMedia(): js.Promise[MediaStream] = js.native
  def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream] = js.native
  
  var ondevicechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_devicechange(`type`: devicechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
}
