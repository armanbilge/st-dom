package dom.std

import dom.std.stdStrings.message
import dom.std.stdStrings.messageerror
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Channel Messaging API interface represents one of the two ports of a MessageChannel, allowing messages to be sent from one port and listening out for them arriving at the other. */
@js.native
trait MessagePort
  extends StObject
     with EventTarget
     with Transferable
     with _MessageEventSource {
  
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[js.Any], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[js.Any], js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[js.Any], js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[js.Any], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[js.Any], js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[js.Any], js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /**
    * Disconnects the port, so that it is no longer active.
    */
  def close(): Unit = js.native
  
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[js.Any], js.Any]) | Null = js.native
  
  var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[js.Any], js.Any]) | Null = js.native
  
  def postMessage(message: js.Any): Unit = js.native
  def postMessage(message: js.Any, options: PostMessageOptions): Unit = js.native
  /**
    * Posts a message through the channel. Objects listed in transfer are transferred, not just cloned, meaning that they are no longer usable on the sending side.
    *
    * Throws a "DataCloneError" DOMException if transfer contains duplicate objects or port, or if message could not be cloned.
    */
  def postMessage(message: js.Any, transfer: js.Array[Transferable]): Unit = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[js.Any], js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[js.Any], js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[js.Any], js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[js.Any], js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[js.Any], js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[js.Any], js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /**
    * Begins dispatching messages received on the port.
    */
  def start(): Unit = js.native
}
