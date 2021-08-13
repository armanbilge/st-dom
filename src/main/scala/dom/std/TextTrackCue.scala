package dom.std

import dom.std.stdStrings.enter
import dom.std.stdStrings.exit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TextTrackCues represent a string of text that will be displayed for some duration of time on a TextTrack. This includes the start and end times that the cue will be displayed. A TextTrackCue cannot be used directly, instead one of the derived types (e.g. VTTCue) must be used. */
@js.native
trait TextTrackCue
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_enter(`type`: enter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enter(
    `type`: enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enter(
    `type`: enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(`type`: exit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /**
    * Returns the text track cue end time, in seconds.
    *
    * Can be set.
    */
  var endTime: Double = js.native
  
  /**
    * Returns the text track cue identifier.
    *
    * Can be set.
    */
  var id: java.lang.String = js.native
  
  var onenter: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onexit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  /**
    * Returns true if the text track cue pause-on-exit flag is set, false otherwise.
    *
    * Can be set.
    */
  var pauseOnExit: scala.Boolean = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_enter(`type`: enter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enter(
    `type`: enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enter(
    `type`: enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(`type`: exit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /**
    * Returns the text track cue start time, in seconds.
    *
    * Can be set.
    */
  var startTime: Double = js.native
  
  /**
    * Returns the TextTrack object to which this text track cue belongs, if any, or null otherwise.
    */
  val track: TextTrack | Null = js.native
}
