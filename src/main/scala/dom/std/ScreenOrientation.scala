package dom.std

import dom.std.stdStrings.change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenOrientation
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  val angle: Double = js.native
  
  def lock(orientation: OrientationLockType): js.Promise[Unit] = js.native
  
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  val `type`: OrientationType = js.native
  
  def unlock(): Unit = js.native
}
