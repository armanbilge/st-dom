package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait External extends StObject {
  
  /** @deprecated */
  def AddSearchProvider(): Unit = js.native
  
  /** @deprecated */
  def IsSearchProviderInstalled(): Unit = js.native
}
object External {
  
  @scala.inline
  def apply(AddSearchProvider: () => Unit, IsSearchProviderInstalled: () => Unit): External = {
    val __obj = js.Dynamic.literal(AddSearchProvider = js.Any.fromFunction0(AddSearchProvider), IsSearchProviderInstalled = js.Any.fromFunction0(IsSearchProviderInstalled))
    __obj.asInstanceOf[External]
  }
}
