package dom.std

import dom.std.stdStrings.cached
import dom.std.stdStrings.checking
import dom.std.stdStrings.downloading
import dom.std.stdStrings.error
import dom.std.stdStrings.noupdate
import dom.std.stdStrings.obsolete
import dom.std.stdStrings.progress
import dom.std.stdStrings.updateready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCache
  extends StObject
     with EventTarget {
  
  val CHECKING: Double = js.native
  
  val DOWNLOADING: Double = js.native
  
  val IDLE: Double = js.native
  
  val OBSOLETE: Double = js.native
  
  val UNCACHED: Double = js.native
  
  val UPDATEREADY: Double = js.native
  
  /** @deprecated */
  def abort(): Unit = js.native
  
  @JSName("addEventListener")
  def addEventListener_cached(`type`: cached, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cached(
    `type`: cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cached(
    `type`: cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_checking(`type`: checking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_checking(
    `type`: checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_checking(
    `type`: checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloading(`type`: downloading, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloading(
    `type`: downloading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloading(
    `type`: downloading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_noupdate(`type`: noupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_noupdate(
    `type`: noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_noupdate(
    `type`: noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_obsolete(`type`: obsolete, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_obsolete(
    `type`: obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_obsolete(
    `type`: obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateready(`type`: updateready, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateready(
    `type`: updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateready(
    `type`: updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /** @deprecated */
  var oncached: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  /** @deprecated */
  var onchecking: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  /** @deprecated */
  var ondownloading: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  /** @deprecated */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  /** @deprecated */
  var onnoupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  /** @deprecated */
  var onobsolete: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  /** @deprecated */
  var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], js.Any]) | Null = js.native
  
  /** @deprecated */
  var onupdateready: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_cached(`type`: cached, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cached(
    `type`: cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cached(
    `type`: cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_checking(`type`: checking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_checking(
    `type`: checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_checking(
    `type`: checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloading(`type`: downloading, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloading(
    `type`: downloading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloading(
    `type`: downloading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_noupdate(`type`: noupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_noupdate(
    `type`: noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_noupdate(
    `type`: noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_obsolete(`type`: obsolete, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_obsolete(
    `type`: obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_obsolete(
    `type`: obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updateready(`type`: updateready, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updateready(
    `type`: updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updateready(
    `type`: updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /** @deprecated */
  val status: Double = js.native
  
  /** @deprecated */
  def swapCache(): Unit = js.native
  
  /** @deprecated */
  def update(): Unit = js.native
}
