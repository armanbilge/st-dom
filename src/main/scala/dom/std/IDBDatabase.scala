package dom.std

import dom.std.stdStrings.abort
import dom.std.stdStrings.close
import dom.std.stdStrings.error
import dom.std.stdStrings.versionchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This IndexedDB API interface provides a connection to a database; you can use an IDBDatabase object to open a transaction on your database then create, manipulate, and delete objects (data) in that database. The interface provides the only way to get and manage versions of the database. */
@js.native
trait IDBDatabase
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
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
  def addEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /**
    * Closes the connection once all running transactions have finished.
    */
  def close(): Unit = js.native
  
  /**
    * Creates a new object store with the given name and options and returns a new IDBObjectStore.
    *
    * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  def createObjectStore(name: java.lang.String): IDBObjectStore = js.native
  def createObjectStore(name: java.lang.String, options: IDBObjectStoreParameters): IDBObjectStore = js.native
  
  /**
    * Deletes the object store with the given name.
    *
    * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  def deleteObjectStore(name: java.lang.String): Unit = js.native
  
  /**
    * Returns the name of the database.
    */
  val name: java.lang.String = js.native
  
  /**
    * Returns a list of the names of object stores in the database.
    */
  val objectStoreNames: DOMStringList = js.native
  
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onversionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, js.Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
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
  def removeEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  def transaction(storeNames: Iterable[java.lang.String]): IDBTransaction = js.native
  def transaction(storeNames: Iterable[java.lang.String], mode: IDBTransactionMode): IDBTransaction = js.native
  /**
    * Returns a new transaction with the given mode ("readonly" or "readwrite") and scope which can be a single object store name or an array of names.
    */
  def transaction(storeNames: java.lang.String): IDBTransaction = js.native
  def transaction(storeNames: java.lang.String, mode: IDBTransactionMode): IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String]): IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String], mode: IDBTransactionMode): IDBTransaction = js.native
  
  /**
    * Returns the version of the database.
    */
  val version: Double = js.native
}
