package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSBlobBuilder extends StObject {
  
  def append(data: js.Any): Unit = js.native
  def append(data: js.Any, endings: java.lang.String): Unit = js.native
  
  def getBlob(): Blob = js.native
  def getBlob(contentType: java.lang.String): Blob = js.native
}
