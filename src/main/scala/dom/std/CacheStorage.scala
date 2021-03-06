package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The storage for Cache objects. */
@js.native
trait CacheStorage extends StObject {
  
  def delete(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  
  def has(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  
  def keys(): js.Promise[js.Array[java.lang.String]] = js.native
  
  def `match`(request: RequestInfo): js.Promise[js.UndefOr[Response]] = js.native
  def `match`(request: RequestInfo, options: MultiCacheQueryOptions): js.Promise[js.UndefOr[Response]] = js.native
  
  def open(cacheName: java.lang.String): js.Promise[Cache] = js.native
}
