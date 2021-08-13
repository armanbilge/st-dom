package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type of `import.meta`.
  *
  * If you need to declare that a given property exists on `import.meta`,
  * this type may be augmented via interface merging.
  */
@js.native
trait ImportMeta extends StObject {
  
  var url: java.lang.String = js.native
}
object ImportMeta {
  
  @scala.inline
  def apply(url: java.lang.String): ImportMeta = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportMeta]
  }
}
