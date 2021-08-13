package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSMediaKeySession
  extends StObject
     with EventTarget {
  
  def close(): Unit = js.native
  
  val error: MSMediaKeyError | Null = js.native
  
  val keySystem: java.lang.String = js.native
  
  val sessionId: java.lang.String = js.native
  
  def update(key: Uint8Array): Unit = js.native
}
