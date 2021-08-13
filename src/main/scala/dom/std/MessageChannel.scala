package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Channel Messaging API interface allows us to create a new message channel and send data through it via its two MessagePort properties. */
@js.native
trait MessageChannel extends StObject {
  
  /**
    * Returns the first MessagePort object.
    */
  val port1: MessagePort = js.native
  
  /**
    * Returns the second MessagePort object.
    */
  val port2: MessagePort = js.native
}
object MessageChannel {
  
  @scala.inline
  def apply(port1: MessagePort, port2: MessagePort): MessageChannel = {
    val __obj = js.Dynamic.literal(port1 = port1.asInstanceOf[js.Any], port2 = port2.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageChannel]
  }
}
