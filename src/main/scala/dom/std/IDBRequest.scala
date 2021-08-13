package dom.std

import dom.std.stdStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The request object does not initially contain any information about the result of the operation, but once information becomes available, an event is fired on the request, and the information becomes available through the properties of the IDBRequest instance. */
@js.native
trait IDBRequest[T]
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: dom.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: dom.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: dom.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(`type`: success, listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /**
    * When a request is completed, returns the error (a DOMException), or null if the request succeeded. Throws a "InvalidStateError" DOMException if the request is still pending.
    */
  val error: DOMException | Null = js.native
  
  var onerror: (js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, js.Any]) | Null = js.native
  
  var onsuccess: (js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, js.Any]) | Null = js.native
  
  /**
    * Returns "pending" until a request is complete, then returns "done".
    */
  val readyState: IDBRequestReadyState = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: dom.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: dom.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: dom.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(`type`: success, listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /**
    * When a request is completed, returns the result, or undefined if the request failed. Throws a "InvalidStateError" DOMException if the request is still pending.
    */
  val result: T = js.native
  
  /**
    * Returns the IDBObjectStore, IDBIndex, or IDBCursor the request was made against, or null if is was an open request.
    */
  val source: IDBObjectStore | IDBIndex | IDBCursor = js.native
  
  /**
    * Returns the IDBTransaction the request was made within. If this as an open request, then it returns an upgrade transaction while it is running, or null otherwise.
    */
  val transaction: IDBTransaction | Null = js.native
}
