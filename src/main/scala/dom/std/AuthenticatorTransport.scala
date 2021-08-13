package dom.std

import dom.std.stdStrings.nfc_
import dom.std.stdStrings.usb_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - dom.std.stdStrings.ble
  - dom.std.stdStrings.internal
  - dom.std.stdStrings.nfc_
  - dom.std.stdStrings.usb_
*/
trait AuthenticatorTransport extends StObject
object AuthenticatorTransport {
  
  @scala.inline
  def ble: dom.std.stdStrings.ble = "ble".asInstanceOf[dom.std.stdStrings.ble]
  
  @scala.inline
  def internal: dom.std.stdStrings.internal = "internal".asInstanceOf[dom.std.stdStrings.internal]
  
  @scala.inline
  def nfc: nfc_ = "nfc".asInstanceOf[nfc_]
  
  @scala.inline
  def usb: usb_ = "usb".asInstanceOf[usb_]
}
