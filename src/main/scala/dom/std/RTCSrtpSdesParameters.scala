package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCSrtpSdesParameters extends StObject {
  
  var cryptoSuite: js.UndefOr[java.lang.String] = js.native
  
  var keyParams: js.UndefOr[js.Array[RTCSrtpKeyParam]] = js.native
  
  var sessionParams: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var tag: js.UndefOr[Double] = js.native
}
object RTCSrtpSdesParameters {
  
  @scala.inline
  def apply(
    cryptoSuite: java.lang.String = null,
    keyParams: js.Array[RTCSrtpKeyParam] = null,
    sessionParams: js.Array[java.lang.String] = null,
    tag: js.UndefOr[Double] = js.undefined
  ): RTCSrtpSdesParameters = {
    val __obj = js.Dynamic.literal()
    if (cryptoSuite != null) __obj.updateDynamic("cryptoSuite")(cryptoSuite.asInstanceOf[js.Any])
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams.asInstanceOf[js.Any])
    if (sessionParams != null) __obj.updateDynamic("sessionParams")(sessionParams.asInstanceOf[js.Any])
    if (!js.isUndefined(tag)) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSrtpSdesParameters]
  }
}
