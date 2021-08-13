package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The URL interface represents an object providing static methods used for creating object URLs. */
@js.native
trait URL extends StObject {
  
  var hash: java.lang.String = js.native
  
  var host: java.lang.String = js.native
  
  var hostname: java.lang.String = js.native
  
  var href: java.lang.String = js.native
  
  val origin: java.lang.String = js.native
  
  var password: java.lang.String = js.native
  
  var pathname: java.lang.String = js.native
  
  var port: java.lang.String = js.native
  
  var protocol: java.lang.String = js.native
  
  var search: java.lang.String = js.native
  
  val searchParams: URLSearchParams = js.native
  
  def toJSON(): java.lang.String = js.native
  
  var username: java.lang.String = js.native
}
object URL {
  
  @scala.inline
  def apply(
    hash: java.lang.String,
    host: java.lang.String,
    hostname: java.lang.String,
    href: java.lang.String,
    origin: java.lang.String,
    password: java.lang.String,
    pathname: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    search: java.lang.String,
    searchParams: URLSearchParams,
    toJSON: () => java.lang.String,
    username: java.lang.String
  ): URL = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searchParams = searchParams.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[URL]
  }
}
